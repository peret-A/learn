package com.bdqn.demo04;

public class Demo10 {

    /*
    * 条件运算符（三目运算符/三元运算符）：
    *       语法结构：
    *           条件?表达式1:表达式2;
    *       执行规律：
    *           判断条件的结果：
    *               如果条件为true，执行表达式1；
    *               如果条件为false，执行表达式2
    *
    * */

    public static void main(String[] args) {
        //使用条件运算符获取两个数中的最大值
        int num1 = 100;
        int num2 = 200;

        int max =num1>num2?num1:num2;
        System.out.println("两个数中的最大值是："+max);

        //使用条件运算符获取两个数中的最小值
        int min =num1<num2?num1:num2;
        System.out.println("两个书中的最小数："+min);


    }
}
