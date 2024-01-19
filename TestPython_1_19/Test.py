# class A:
#     __name = None
#     age = None
#
#     def __init__(self, name, age):
#         self.__name = name
#         self.age = age
#
#     def print(self):
#         print(f"{self.__name},{self.age}")
#
#
# a = A("a", 2)
# a.print()

# 设计一个手机类用于检测正在使用什么样的网络
class Phnoe:
    # 定义一个私有变量用于开启或者关闭网络
    __is_5g_enable = None
    face_id = 1011
    a = None

    # 对类继续初始化
    def __init__(self):
        # 默认没有开启
        self.__is_5g_enable = False

    # 用于检测网络
    def __check_5g(self):
        self.a = 1
        self.__is_5g_enable = True
        print(self.a)
        if self.__is_5g_enable == True:
            print("开启5g")
        else:
            print("关闭5g,使用4g网络")

    # 打电话方法 先检测网络
    def call_by_4g(self):
        # 检测网络
        self.__check_5g()
        print("正在通话中")

    def call_by_5g(self):
        self.a = 2
        self.__is_5g_enable = True
        print(self.a)
        print("2021新功能")


# phnoe = Phnoe()
# phnoe.call_by_4g()
# phnoe.call_by_5g()


class Phnoe2022(Phnoe):
    face_id = 1011

    def call_by_5g(self):
        self.a = 2
        self.__is_5g_enable = True
        print(self.a)
        print("2022新功能")
        super().call_by_4g()



# phnoe = Phnoe2022()
# phnoe.call_by_5g()
# phnoe.call_by_4g()
class Phnoe2023(Phnoe2022):
    pass


phnoe = Phnoe2023()
phnoe.call_by_5g()
phnoe.call_by_4g()
