# # 打开文件
# f = open("日志.txt", "r", encoding="utf-8")
# print(type(f))
# #读取文件
# print(f.read(3))
#
# print(f.read())
# print(f.read())

# lines=f.readlines()
# print(type(lines))
# print(lines)
#
#
# line=f.readline()
# print(type(line))
# print(line)
# line=f.readline()
# print(type(line))
# print(line)
# line=f.readline()
# print(type(line))
# print(line)
#
#
#
# f.close()


# # 打开日志.txt文件
# # 通过 with open的方式打开
# with open('日志.txt','r',encoding='utf-8') as f:
# # 将文件内容全部导入到line
#     lines=f.read()
# print(lines.count("itheima"))
#
# f=open('日志.txt','w',encoding='utf-8')
# f.write("hello")
# f.write("hello")
# f.flush()
# f.write("\nhello")
# f.close()

# f=open('日志.txt','r',encoding='utf-8')
#
# f.close()


"""
读取文件
将文件写出到bill.txt.bak文件作为备份
同时，将文件内标记为测试的数据行丢弃
"""

# 读取文件
f1 = open('bill.txt', 'r', encoding='utf-8')

# 将文件写出到bill.txt.bak文件作为备份
f2 = open('bill.txt.bak', 'w', encoding='utf-8')
# 获得文件内容
for line in f1:
    f2.write(line)

f1.close()
f2.close()

# 同时，将文件内标记为测试的数据行丢弃
# 读取文件
f1 = open('bill.txt.bak', 'r', encoding='utf-8')
f2 = open('bill.txt', 'w', encoding='utf-8')
# 获得文件内容
for line in f1:
    if line.count('测试') == 0:
        f2.write(line)

f1.close()
f2.close()
