package com.bdqn.demo04;

public class Demo05 {
    /*
    * 关系运算符（比较运算符）：
    *   > >= < <= == !=
    *
    *   关系运算符的结果是布尔值，要么成立（true），要么不成立（false）
    *   为赋值运算符，==为等于运算符
    *   >、<、>=、<= 运算符的优先级别高于==、!=
    *   >、<、>=、<=运算符只支持数值类型的数据比较,==和!=可以比较引用数据类型的内存地址值
    *
    * */

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;
        int num3 = 100;

        boolean result1 =num1>num2;
        System.out.println("num1>num2："+result1);

        boolean result2 =num1<num2;
        System.out.println("num1<num2："+result2);

        boolean result3 =num1>=num3;
        System.out.println("num1>=num3："+result3);

        boolean result4 =num1<=num3;
        System.out.println("num1<=num3："+result4);

        boolean result5=num1==num3;
        System.out.println("num1==num3："+result5);

        boolean result6 =num1!=num2;
        System.out.println("num1!=num2："+result6);



    }
}
