package com.bdqn.demo04;

public class Demo06 {
    /*
    * 逻辑运算符：
    *   &(单与)、&&(双与/短路与) 、|(单或) 、||(双或/短路或) 、！(非)
    *
    *   与运算和或运算，运算符左右两边需要布尔类型的表达式
    *   非运算只需要在运算符右边有一个布尔类型的表达式
    *   逻辑运算符的结果还是布尔值，要么成立（true），要么不成立（false）
    * */

    public static void main(String[] args) {

        int num1 =100;
        int num2 = 200;

        boolean result = num1<num2 && num2>num1;
        System.out.println(result);

        System.out.println("------------------------");

        //true&true-->true
        boolean result1 =true&true;
        System.out.println("true&true:"+result1);

        //true&false-->false
        boolean result2 =true&false;
        System.out.println("true&false:"+result2);

        //false&true-->false
        boolean result3 =false&true;
        System.out.println("false&true:"+result3);

        //false&false-->false
        boolean result4 =false&false;
        System.out.println("false&false:"+result4);

        System.out.println("------------------------");

        //true&&true-->true
        boolean result5 =true&&true;
        System.out.println("true&&true:"+result5);

        //true&&false-->false
        boolean result6 =true&&false;
        System.out.println("true&&false:"+result6);

        //false&&true-->false
        boolean result7 =false&&true;
        System.out.println("false&&true:"+result7);

        //false&false-->false
        boolean result8 =false&&false;
        System.out.println("false&&false:"+result8);

        /*
        * 由上面的运算结果可知：
        *   &和&&的运算规律是一样的，只有&或者&&左右两边的表达式同时为true。&或者&&的运算结果才为true
        * */

    }
}
