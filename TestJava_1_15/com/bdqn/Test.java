package com.bdqn;

import java.util.Scanner;

public class Test {
    /**
     * 题目：设计一个图书管理系统，功能如下：
     *
     * 要求：
     * 	1）通过账号控制图书管理系统，账号分为管理员账号和普通用户账号
     * 		管理员账号和普通用户账号都可以使用手机号码+密码、身份证号码+密码的形式登录
     * 		管理员账号和普通账号除了手机号码、身份中号码、密码三个数据之外，还有姓名、性别、专业、住址信息
     * 	2）启动系统后，显示登录账号、注册账号、退出登录三个模块
     * 		登录账号：
     * 			显示管理员登录、用户登录两个模块
     * 		注册账号：
     * 			显示注册管理员、注册用户两个模块
     * 		退出登录：
     * 			结束程序运行
     *
     * 	3）登录账号成功后，根据账号的性质来显示不同的模块：
     * 		登录普通账号成功后，显示如下模块：
     * 			--》查看所有图书，图书显示哪些信息，你自行设计
     * 			--》借阅图书
     * 			--》归还图书
     * 			--》显示用户信息（只能查看自己的用户信息）
     * 			--》修改用户信息（只能修改自己的用户信息）
     * 			--》退出系统
     * 		登录管理员账号成功后，显示如下模块：
     * 			--》查看所有图书，图书显示哪些信息，你自行设计
     * 			--》添加图书
     * 			--》修改图书
     * 			--》删除图书
     * 			--》查看所有普通用户信息
     * 			--》查看管理员账号信息
     * 			--》修改管理员账号信息
     * 			--》退出系统
     *
     * 提交作业要求：
     * 	1）新建一个项目完成上述内容，提交整个项目代码
     * 	2）项目编写完毕之后，自行测试，测试没有问题之后，进行一个完整的操作，这个操作过程录屏
     * 	3）提交截止时间：2024年1月14日 21：00之前
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        //初始化用户表与图书表
        User[] users = new User[4];
        Book[] books = new Book[4];
        Init(users,books);
        //choose用于选择
        int choose;
        do{
            mean();
            System.out.print("选择:");
            choose=scanner.nextInt();
            switch (choose){
                case 0:
                    System.out.println("----------------------退出系统-------------------------");
                    break;
                case 1:
                    System.out.println("----------------------账号登录-------------------------");
                    Login();
                    break;
                case 2:
                    System.out.println("----------------------注册账号-------------------------");
                    Enroll();
                    break;
            }
        }while(choose!=0);
    }
    //主菜单
    public static void mean(){
        System.out.println("----------------------图书管理系统-------------------------");
        System.out.println("1. 账号登录");
        System.out.println("2. 注册账号");
        System.out.println("0. 退出系统");
    }
    //账号登录
    public static void Login(){

    }
    //注册账号
    public static void  Enroll(){

    }
    //初始化用户与图书
    public static void Init(User[] users,Book[] books){
        //初始化管理员账号
        users[0].setUtel("156");
        users[0].setUid("341");
        users[0].setUpass("123");
        //0. 为普通用户  1. 为管理员用户
        users[0].setPer(1);
        //初始化图书库
        Book book=new Book("奥特曼大战小怪兽",5,"安徽出版社");
        books[0]=book;
        Book book1=new Book();

    }
}
