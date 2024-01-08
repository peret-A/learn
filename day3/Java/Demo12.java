package com.bdqn.demo04;

import java.util.Scanner;

public class Demo12 {
    /*
    * 条件运算符的嵌套：在条件运算符中包含另外的条件运算符
    *   语法结构：
    *       条件1?(条件2?表达式1:表达式2):(条件3?表达式3:表达式4);
    *   执行规律：
    *       首先判断条件1：
    *           如果条件1为true，接着判断条件2：
    *               如果条件2为true，执行表达式1
    *               如果条件2为false，执行表达式2
    *           如果条件1为false，接着判断条件3：
    *               如果条件3为true，执行表达式3
    *               如果条件3为false，执行表达式4
    * */

    public static void main(String[] args) {
        //从键盘输入3个整数，输出3个整数中的最大值

        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int num1 =scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 =scanner.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 =scanner.nextInt();

        int max =num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println("你输入的三个数中的最大值是："+max);
    }
}
