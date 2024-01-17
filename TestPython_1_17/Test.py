# class Student:
#     name = None     #记录姓名
#     gender = None   #记录性别
#     age = None      #记录年龄
#     def sya(self):
#         print(self.name)
# stu_1=Student()
# stu_1.age=18
# stu_1.name="小明"
# stu_1.gender="男"
# print(stu_1.gender)
# stu_1.sya()

# # 设计一个闹钟类
# class Clock:
#     # id = None #序号
#     # price = None #价格
#     def ring(self):
#         import winsound
#         winsound.Beep(2000, 3000)
#     #
#     # def __init__(self, id, price):
#     #     self.id = id
#     #     self.price = price
#
#     def __init__(self, id, price,color):
#         self.id = id
#         self.price = price
#         self.color=color
#
# # clock1 = Clock(1, 10)
# # print(f"闹钟的序号:{clock1.id},闹钟的价格:{clock1.price}")
# # clock1.ring()
# clock2 = Clock(1, 10,"red")
# print(f"闹钟的序号:{clock2.id},闹钟的价格:{clock2.price},{clock2.color}")
#
# # 定义一个学生类
# class Student:
#     name = None
#     age = None
#     adder = None
#
#     # 通过构造方法定义成员变量
#     def __init__(self):
#         self.name = input("请输入学生的姓名:")
#         self.age = input("请输入学生的年龄:")
#         self.adder = input("请输入学生的地址:")


# # 输入十位学生信息
# for x in range(0, 3):
#     # 实例化对象
#     student = Student()
#     print(f"学生{x + 1}信息录入完成，信息为:[ 学生姓名: {student.name},年龄: {student.age},地址: {student.adder}]")


# 定义一个学生类
class Student:
    name = None
    age = None
    adder = None

    # 魔术方法
    # 通过构造方法定义成员变量
    def __init__(self, name, age, adder):
        self.name = name
        self.age = age
        self.adder = adder

    # __str__

    def __str__(self):
        return f"学生的姓名:{self.name}，学生的年龄:{self.age},学生的地址:{self.adder}"

    # __lt__

    def __lt__(self, other):
        return self.age < other.age

    def __le__(self, other):
        return self.age <= other.age

    # def __eq__(self, other):
    #     return self.age == other.age


# 测试
stu_1 = Student("小明", 35, "2-311")
stu_2 = Student("小红", 21, "3-444")
print(stu_1)
print(stu_2)
print(stu_2 < stu_1)
print(stu_1 <= stu_2)
print(stu_2 == stu_1)

