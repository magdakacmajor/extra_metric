import os
import sys
import json
import fnmatch
from types import SimpleNamespace


def read_file(fpath):
    with open(fpath) as f:
        lines = f.readlines()
    return lines


def get_parent_project(top_project, class_name, package_name):
    for root, _, files in os.walk(os.path.abspath(top_project)):
        if fnmatch.filter(
            files,
            f'{class_name}.java') and root.endswith(
            package_name.replace(
                ".",
                "/")):
            full_path = root.split('/')
            return root, full_path[full_path.index("src") - 1]
    return None


def main():

    path = f'{os.path.abspath(os.path.dirname(__file__))}/../config/mapping_params.json' if len(
        sys.argv) == 1 else sys.argv[1]
    with open(path) as f:
        params = json.load(f)
    cfg = SimpleNamespace(**params)

    parsed_data = f'{cfg.dataset_loc}/{cfg.label}/{cfg.label}/parsed_data'
    corpora = f'{cfg.dataset_loc}/{cfg.label}/corpora'

    corpus_pl = read_file(f'{corpora}/corpus.pl')
    corpus_ids = read_file(f'{corpora}/corpus.ids')
    dev_pl = read_file(f'{corpora}/dev.pl')

    dev_ln = [corpus_pl.index(x) for x in dev_pl]
    dev_ids = [corpus_ids[x] for x in dev_ln]
    tracking_info_list = [dev_id.rstrip().split(",") for dev_id in dev_ids]

    if cfg.map_full_corpus:
        tracking_info_list = [ci.rstrip().split(",") for ci in corpus_ids]

    project_mappings = []

    for tracking_info in tracking_info_list:
        with open(os.path.join(parsed_data, tracking_info[1])) as f:
            testclass_json = json.load(f)

            testcase_json = next(
                (tc for tc in testclass_json['parsedTestCases'] if tc['id'] == tracking_info[2]),
                None)
            if testcase_json['parameters'] or 'ABSTRACT' in testcase_json['classModifiers']:
                testcase_json['executable'] = False
                print(
                    f'{testcase_json["className"]}.{testcase_json["methodName"]}')
            else:
                testcase_json['executable'] = True
            package_name = testcase_json['packageName'][len('package '):-1]
            class_name = testcase_json['className']
            inner_class_name = f'.{testcase_json["ancestorClassName"]}' if testcase_json.get(
                'ancestorClassName', None) else ""
            method_name = testcase_json['methodName']

            testcase_fullname = f'{package_name}.{class_name}{inner_class_name}.{method_name}'

            if not cfg.alt_location:
                filepath = testcase_json['filepath'].split('/')
                parent_project = filepath[filepath.index('src') - 1]
            else:
                filepath, parent_project = get_parent_project(
                    f'{cfg.alt_location}/{cfg.label}', class_name, package_name)
                testcase_json['filepath'] = f'{filepath}/{class_name}.java'

            testcase_json['parent_project'] = parent_project
            testcase_json['testcase_fullname'] = testcase_fullname

            project_mappings.append(testcase_json)

    with open(cfg.output_file, 'w') as f:
        json.dump(project_mappings, f)

#     with open (os.path.join(working_dir, 'nowy-dev.ids'), 'w') as f:
#         f.writelines(dev_ids)


if __name__ == '__main__':
    main()
