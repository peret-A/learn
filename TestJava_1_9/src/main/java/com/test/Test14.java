package com.test;

import java.util.Scanner;

public class Test14 {
    /*
    18：输出一个整数的二进制数、八进制数、十六进制数。
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        //输入一个整数
        int num=scanner.nextInt();
        int num_10=num;
        int count=0;
        //转换成二进制
        int num_2=0;
        while (num_10!=0){
            num_2+=num_10%2*(int)(Math.pow(10,count));
            num_10/=2;
            count++;
        }
        System.out.println(num+"转换成二进制:"+num_2);
        num_10=num;
        count=0;
        //转换成八进制
        int num_8=0;
        while (num_10!=0){
            num_8+=num_10%8*(int)(Math.pow(10,count));
            num_10/=8;
            count++;
        }
        System.out.println(num+"转换成八进制:"+num_8);
        num_10=num;
        count=0;
        //转换成十六进制
        int num_16=0;
        while (num_10!=0){
            num_16+=num_10%16*(int)(Math.pow(10,count));
            num_10/=16;
            count++;
        }
        System.out.println(num+"转换成十六进制:"+num_16);
        num_10=num;
        count=0;
    }
}
