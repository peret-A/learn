package com.bdqn.demo04;

public class Demo08 {

    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("bool1="+bool1);
        System.out.println("bool2="+bool2);

        //!true-->false
        boolean result1 =!bool1;
        System.out.println("!true："+result1);

        //!false-->true
        boolean result2 =!bool2;
        System.out.println("!false："+result2);
        /*
        * ！运算符的运算规律：
        *   ！是进行取反操作，
        *       当表达式结果为true，进行！运算，得到的结果为false；
        *       当表达式结果为false，进行！运算，得到的结果为true
        *
        * */
    }
}
