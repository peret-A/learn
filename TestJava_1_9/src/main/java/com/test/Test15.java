package com.test;

import java.util.Scanner;

public class Test15 {
    /*
    17：输出斐波那契数列数列的前20项
     */
    public static void main(String[] args) {
        int num1=0;
        int num2=1;

        int num3;
        System.out.println("输入斐波那契数列数列的第几项(最少是3)");
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        int item=scanner.nextInt();
        System.out.print("\t"+num1);
        System.out.print("\t"+num2);
        for (int i=0;i<item-2;i++){
            num3=num1+num2;
            System.out.print("\t"+num3);
            num1=num2;
            num2=num3;
        }
    }
}
