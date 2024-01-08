# # 这是一个示例 Python 脚本。
#
# # 按 Shift+F10 执行或将其替换为您的代码。
# # 按 双击 Shift 在所有地方搜索类、文件、工具窗口、操作和设置。
#
#
# def print_hi(name):
#     # 在下面的代码行中使用断点来调试脚本。
#     print(f'Hi, {name}')  # 按 Ctrl+F8 切换断点。
#
#
# # 按装订区域中的绿色按钮以运行脚本。
# if __name__ == '__main__':
#     print_hi('PyCharm')
#
# # 访问 https://www.jetbrains.com/help/pycharm/ 获取 PyCharm 帮助

# # 定义元组
# (1,2,'dw')
#
# # 定义元组变量
# t1=(1,3,'w',"hello world")
#
# #定义空元组
# t2=()
# t3=tuple()
# print(t1)
# print(t2)
# print(t3)
# t5=(1,(2,3),4)
# print(t5)
# print(type(t5))
# print(t5[1])
#
# print(t5.index(1))
# print(t5.count(2))
# print(len(t5))
# 000
#
# # 练习案例:元组的基本操作
# # 定义一个元组，内容是:('周杰轮'，11, ['football , 'music'])，记录的是一个学生的信息（姓名、年龄、爱好)
# my_tuple=('周杰轮',11,['football' , 'music'])
# # 查询其年龄所在的下标
# print(my_tuple.index(11))
# #查询学生姓名
# print(my_tuple.index('周杰轮'))
# #删除学生爱好中的football
# del my_tuple[2][1]
# print(my_tuple)
# my_tuple[2].append('coding')
# print(my_tuple)

#
# my_str="hello world"
# print(my_str)
# print(my_str[0])
# print(my_str.count('l'))
# print(my_str[-1])
#
# my_str1="hello"
# my_str2="world"
# print(my_str1)
# print(my_str2)
# my_str1.replace("a","d")
# print(my_str1)
# print(my_str)
# print(type(my_str))
# print(my_str.split(" "))
# print(type(my_str.split(" ")))

# 定义strip方法的使用
# my_str =" 12hello world21 "
# print(my_str)
# print(my_str.strip())
# print(my_str.strip(" 12"))
# print(my_str.count('l'))
# print(len(my_str))


# my_str="hello world"
# i=0
# while i< len(my_str):
#     print(my_str[i])
#     i+=1
# for x in my_str:
#     print(x)

# 练习案例:分割字符串
# 给定一个字符串: "itheima itcast boxuegu"。统计字符串内有多少个"it"字符
# 。将字符串内的空格，全部替换为字符:""。并按照""进行字符串分割，得到列表

my_str="itheima itcast boxuegu"
print(f'统计字符串内有{my_str.count("it")}个"it"字符')
print(f'将字符串内的空格，全部替换为字符 {my_str.replace(" ", "|")}')
# 这里的错误就是理所当然的将上面的my_str.replace(" ", "|") 认为原本的字符串发生改变。
# 注：字符串是不可改变的。
# print(f'进行字符串分割，得到列表{my_str.split("|")}')
print(f'进行字符串分割，得到列表{my_str.split(" ")}')