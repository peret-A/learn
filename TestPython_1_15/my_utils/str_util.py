def str_reverse(s):
    """
    将字符串完成反转
    :param s: 字符串
    :return: 反转完成的字符串
    """
    return s[::-1]


def substr(s, x, y):
    """
    按照给定下标完成指定字符串的操作
    :param s: 字符串
    :param x: 开始下标
    :param y: 结束下标（不包含）
    :return: 完成切片的结果
    """
    return s[x:y]


if __name__ == '__main__':
    res = str_reverse("hello world!!")
    print("hello world!!")
    print(res)

    pls = substr("hello world", 3, 5)
    print(pls)
