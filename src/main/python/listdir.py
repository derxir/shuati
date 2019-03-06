import os


def list_all_directories(path):
    listdir = os.listdir(path)
    for dir in listdir:
        full_path = os.path.join(path, dir)
        if os.path.isdir(full_path):
            list_all_directories(full_path)
        else:
            print(full_path)


list_all_directories("/Users/justin/Deployment")
