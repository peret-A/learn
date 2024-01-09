# # 数据容器的定义
# my_list = [1, 2, 3, 4, 5]
# my_tuple = (1, 2, 3, 4, 5)
# my_str = "12345"
# my_set = {1, 2, 3, 4, 5}
# my_dict = {"a": 1, "b": 2, "c": 3, "d": 4, "e": 5}
#
# # 统计容器个数
# print(len(my_list))
# print(len(my_tuple))
# print(len(my_str))
# print(len(my_set))
# print(len(my_dict))
#
# # 统计最大值
# print(max(my_list))
# print(max(my_tuple))
# print(max(my_str))
# print(max(my_set))
# print(max(my_dict))
#
# # 统计最小值
# print(min(my_list))
# print(min(my_tuple))
# print(min(my_str))
# print(min(my_set))
# print(min(my_dict))
#
# # 类型转换
# print(list(my_list))
# print(list(my_tuple))
# print(list(my_set))
# print(list(my_str))
# print(list(my_dict))
#
# print(tuple(my_list))
# print(tuple(my_tuple))
# print(tuple(my_set))
# print(tuple(my_str))
# print(tuple(my_dict))
#
# print(str(my_list))
# print(str(my_tuple))
# print(str(my_set))
# print(str(my_str))
# print(str(my_dict))
#
# print(set(my_list))
# print(set(my_tuple))
# print(set(my_set))
# print(set(my_str))
# print(set(my_dict))
#
# print(sorted(my_list, reverse=True))
# print(sorted(my_tuple, reverse=True))
# print(sorted(my_str, reverse=True))
# print(sorted(my_set, reverse=True))
# print(sorted(my_dict, reverse=True))

#
# print(f"a大于A{'a' > 'A'}")
# print(f"ab大于a {'ab' > 'a'}")

#
# def test():
#     return 1, 2, 3

#
# def test():
#     return 1, 2, 'hello'
# x, y, z = test()
# print(x)
# print(y)
# print(z)
#
# def test(name,age,gender='female'):
#     print(name)
#     print(age)
#     print(gender)
#
# test("小王",age=18)


# def test(*args):
#     print(args)
#
# test("a",2)
# test([1,2,3,4])
#
#
# def test(**kwargs):
#     print(kwargs)
#
# test(name='小王',age=18,gender='male')

#
# def test1():
#     return test2(1, 2)
#
#
# def test2(x, y):
#     return x, y
#
#
# x, y = test1()
# print(x)
# print(y)

def test(test1):
    result=test1(1,2)
    return result


print(test(lambda x, y: x + y))

