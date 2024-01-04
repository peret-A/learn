# str1="Hello World!"
# str2="Hellp Nowcode!"
# print(str1,end='')
# print(str2)

#这样的写法是错误的，str的类型不会变
# str=input()
# print(str)
# print(type(int(str)))
# print(type(str))

#正确的写法如下：
# str=int(input())
# print(str)
# print(type(str))


#错误的写法与c略有不同
# num=float(input())
# print("%.2f",num)
#正确的如下
# num=float(input())
# print("%.2f" %num)

#
# num=int(input())
# print(float(num))
# num1=float(num)
# print(type(num1))

#
# num=int(input())
# print(num)

# str='abcdef'
# for x in str:
#     print(x)
#
# i=1
# while i<10:
#     print(i)
#     i+=1


# for x in range(3,10,2):
#     print(x)

#
# for x in range(10):
#     print("送花")
# count=0
# num=int(input())
# for x in range(1,num):
#     if(x%2==0):
#         count+=1
# print(f"1到{num}(不含{num}本身)范围内，有{count}个偶数")


# for x in range(5):
#     print(x)
# print(x)


# for i in range(1,10):
#     for j in range(1,i+1):
#         print(f"\t{i}*{j}={i*j}",end='')
#     print('')



# for i in range(1,10):
#     j=1
#     while j<i+1:
#         print(f"\t{i}*{j}={i*j}",end='')
#         j+=1
#     print('')
#


# num=input()583
#
# import random
# performance=int(random.randint(1,10))
# sum=10000
# employee=1
# while sum>0:
#     if performance<5:
#         if employee<20:
#             print(f"员工{employee},绩效分{performance},低于5，不发工资，下一位")
#         else :
#             print(f"员工{employee},绩效分{performance},低于5，不发工")
#             break
#     else:
#             print(f"向员工{employee}发放工资1000元，账户余额还剩余{sum}元")
#             sum-=1000
#
#
#     employee+=1
#     performance = int(random.randint(1, 10))
# if sum==0:
#     print("工资发完了，下个月领取吧")


# import  random
# sum=10000
# for i in range(1,21):
#     score=random.randint(1,10)
#     if score<5:
#         print(f"员工{i},绩效分{score},低于5，不发工资，下一位")
#         continue
#     if sum>0:
#         sum-=1000
#         print(f"向员工{i}发放工资1000元，账户余额还剩余{sum}元")
#     else:
#         print("工资发完了，下个月领取吧")
#         break;


# def my_len(sstr):
#     count=0
#     for x in sstr:
#         count+=1
#     return count
# str1="hello world"
# print(my_len(str1))
#


# #定义一个hi函数 为了打印helloworld
# def hi():
#     print("hello world")
# #调用函数
# hi()

# # 定义函数自动查核酸
# def nucleicAcid():
#     print("""
#     欢迎来到黑马程序员！
#     请出示你的健康码以及核酸证明!
#     """)
# # 调用函数
# nucleicAcid()

# # 定义两数相加
# def add(a,b):
#     return a+b
#
# #调用函数
# print(add(1,6))

# # 定义查核酸
# def check(temp):
#     if temp>37.5:
#         print(f"体温:{temp},需要隔离")
#     else:
#         print(f"体温:{temp},体温正常请进")
# # 调用函数
# check(37.8)


# # 定义两数相加
# def add(a,b):
#     return a+b
# # 调用函数
# print(add(2, 3))

# def 函数名(参数):
#     """
#
#     :param 参数:
#     :return:
#     """
#     函数体
#     return 返回值
#
# def a():
#     b()
#     print("a")
# def b():
#
#     print("b")
# a()
#
#
