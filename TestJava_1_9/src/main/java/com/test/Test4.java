package com.test;

import java.util.Scanner;

public class Test4 {
    /*
    28：求两个整数的最大公约数和最小公倍数
     */
    public static void main(String[] args) {
        //辗转相除法 num1%num2==0时 num2为最大公约数
        //创建Scanner

        Scanner scanner=new Scanner(System.in);
        System.out.println("输入num1 和 num2");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        //要注意num1要大于num2 如果小于就交换
        if(num1<num2){
            num1+=num2;
            num2=num1-num2;
            num1-=num2;
        }
        //num3 num4用于给num1 num2备份
        int num3=num1;
        int num4=num2;
        int remainder=num1%num2;   //余数
        while (remainder!=0){
            num1=num2;
            num2=remainder;
            remainder=num1%num2;
        }
        System.out.println("最大公约数为" + num2);

        //最小公倍数  num1*num2/最大公约数
        System.out.println("最小公倍数为" + num3*num4/num2);
    }
}
