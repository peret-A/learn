# 序列的切片
# my_list=[1,2,3,4]
# print(my_list)
# my_list_new=my_list[1:3:1]
# print(my_list_new)
# print(my_list)
#
# my_tuple=(1,2,3,4,5)
# print(my_tuple)
# my_tuple_new=my_tuple[:]
# print(my_tuple_new)
#
# my_str="12345678"
# print(my_str)
# my_str_new=my_str[::2]
# print(my_str_new)
#
# my_str_renew=my_str[::-1]
# print(my_str_renew)
#
# my_str_renew=my_str[:]
# print(my_str_renew)
#
# my_tuple_new=my_tuple[::-2]
# print(my_tuple_new)

# my_str="学python，来黑马程序员，月薪过万"
# my_str=my_str[::-1]
# print(my_str)
# my_str=my_str.split("，")
# print(my_str)
# my_str=my_str[1]
# print(my_str)
# # my_str=my_str[4::-1]
# # print(my_str)
# my_str=my_str.replace("来","")
# print(my_str)
# my_str=my_str[::-1]
# print(my_str)

# # 集合测试
# # 字面量集合
# {1,2,3,4,5,6}
# # 变量集合
# my_set={2,1,2,2,3,2,23,4,5,6}
# print(my_set)
# #空集合
# my_set=set()
# print(my_set)


# my_set.add(123)
# print(my_set)
#
# my_set.remove(2)
# print(my_set)
#
#
# a=my_set.pop()
# print(a)
# print(my_set)
#
# a=my_set.pop()
# print(a)
# print(my_set)
#
# a=my_set.pop()
# print(a)
# print(my_set)

#
# my_set1={1,2,3,4,5}
# my_set2={3,4,5,6,7}
# print(my_set1)
# print(my_set2)
# my_set3=my_set1.difference(my_set2)
# print(my_set3)
# print(my_set1)
# print(my_set2)
# print(my_set3)
#
#
# my_set1.difference_update(my_set2)
# print(my_set1)
#
# my_set4=my_set1.union(my_set2)
# print(my_set4)
#
# for x in my_set1:
#     print(x)


# # 信息去重
#
# # 定义空集合
# my_set=set()
#
# # 用for循环遍历列表
# my_list=['黑马程序员', '传智播客', '黑马程序员','传智播客', 'itheima','itcast','itheima','itcast','best']
# for x in my_list:
#     print(x)
#
# # 通过for循环添加元素至集合
# for x in my_list:
#     my_set.add(x)
#
# # 打印结果
# print(my_set)

#
# # 字典测试
# # 字面量测试
# {"a": 1, "b": 2}
#
# # 变量字典
# my_dict = {"a": 1, "b": 2, "c": 3}
#
# # 定义空字典
# my_dict1 = {}
# my_dict2 = dict()
#
# print(my_dict)
# print(type(my_dict))
#
# print(my_dict1)
# print(type(my_dict1))
#
# print(my_dict2)
# print(type(my_dict2))
#
# score=my_dict["a"]
# print(score)
#
# my_dict={"奥特曼": {"语文": 77, "数学": 66, "英语": 33},
#          "孙悟空": {"语文": 88, "数学": 86, "英语": 55},
#          "小怪兽": {"语文": 99, "数学": 96, "英语": 66}}
#
# print(my_dict["小怪兽"]["数学"])
# print(my_dict)
#

#
# my_dict= {"a": 1, "b": 2, "c": 3}
#
# print(my_dict)
# my_dict["b"]= 4
# print(my_dict)

#
# my_dict= {"a": 1, "b": 2, "c": 3}
#
# print(my_dict)
# my_dict["b"]= "fan"
# print(my_dict)
#
# my_dict["d"]=4
# print(my_dict)
#
# my_dict.pop("b")
# print(my_dict)
# #
# # my_dict.clear()
# # print(my_dict)
#
# keys =my_dict.keys()
#
# print(type(keys))
#
# print(len(my_dict))
#
# for key in keys:
#     print(key,end=" ")
#     print(my_dict[key])


my_dict = {"王力宏": {"部门": "科技部", "工资": 3000, "级别": 1},
           "周杰伦": {"部门": "市场部", "工资": 5000, "级别": 2},
           "李俊杰": {"部门": "市场部", "工资": 7000, "级别": 3},
           "张学友": {"部门": "科技部", "工资": 4000, "级别": 1},
           "刘德华": {"部门": "市场部", "工资": 6000, "级别": 2}}
print("员工更新前信息：")
# print(my_dict)
# 通过for循环，对1级员工级别升1，薪水假1000
# 方式1:
for key in my_dict:
    print(key, end=":")
    print(my_dict[key])

# # 方式2
# keys = my_dict.keys()
# for key in keys:
#     print(key,end=":")
#     print(my_dict[key])
print("员工更新后信息：")
# 用for遍历字典
for key in my_dict:
    # 判断级别是否为1
    if my_dict[key]["级别"] == 1:
        # 更新数据
        my_dict[key]["级别"] = 2
        my_dict[key]["工资"] += 1000
        # 输出信息
    print(key, end=":")
    print(my_dict[key])
