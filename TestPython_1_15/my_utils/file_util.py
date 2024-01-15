def print_file_info(file_name):
    try:
        f=open(file_name,'r',encoding='utf-8')
        for line in f:
            print(line)
    except Exception as e:
        print("文件不存在")
        f=open(file_name,'a',encoding='utf-8')
    finally:
        if f:
          f.close()

def addpend_to_file(file_name,data):
    """

    :param file_name: 指定的文件名
    :param data: 追加的内容
    :return:
    """
    f=open(file_name,'a',encoding='utf-8')
    f.write(data)
    f.write('\n')
    f.close()