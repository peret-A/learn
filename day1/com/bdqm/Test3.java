package com.bdqm;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
//        使用Scanner类获取键盘输入的会员卡号，并将该数据存储在变量中，输出这个变量的信息
        System.out.println("请输入4位会员卡号");
        //创建Scanner类为了输入
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("会员卡号是:" + num);
    }

}
