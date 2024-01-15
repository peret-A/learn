# def func1():
#     num=1/0
#     print("func1")
#
# def func2():
#     func1()
#     print("func2")
#
# def main():
#     try:
#         func2()
#     except Exception as e:
#         print(e)
#
#
# main()
import time
# # 导入时间模块
# import time
#
# print("程序开始")
# # 调用sleep方法  作用 暂停
# time.sleep(5)
#
# print("程序结束")


# # 通过from导入time的sleep方法
# from time import sleep
#
# print("程序开始")
# # 调用sleep方法  作用 暂停
# sleep(5)
# print("程序结束")


# # 通过from导入time全部功能
# from time import *
#
# print("程序开始")
# # 调用sleep方法  作用 暂停
# sleep(5)
# print("程序结束")

# # 通过from导入time全部功能
# import time as t
#
# print("程序开始")
# # 调用sleep方法  作用 暂停
# t.sleep(5)
# time.sleep(5)
# print("程序结束")

# import Test1
#
#
# print(Test1.add(1, 2))
#
# from Test1 import add
#
# from Test1 import *
#
# add(1, 2)
# # div(1, 2)


# from my_utils import str_util
# from my_utils import file_util
#
# str_util.str_reverse("hello")
# str_util.substr("hello",1,3)
# file_util.print_file_info('ab.txt')
# file_util.addpend_to_file('ab.txt',"奥特曼")


# import my_utils.str_util
# import my_utils.file_util
# my_utils.str_util.str_reverse("hello")
# my_utils.str_util.substr("hello",1,3)
# my_utils.file_util.print_file_info("ab.txt")
# my_utils.file_util.addpend_to_file("ab.txt","fan")

from my_utils.str_util import str_reverse
from my_utils.str_util import substr
from my_utils.file_util import *
print(str_reverse("hello"))
print(substr("hello", 1, 3))

print_file_info("ab.txt")
addpend_to_file("ab.txt","a")