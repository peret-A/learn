package com.bdqn.demo04;

public class Demo09 {

    public static void main(String[] args) {

//        int x=8;
//        int y=9;
//        System.out.println((++x==y)&&(++x!=y));//true
//        System.out.println(x);//10

//        int x=8;
//        int y=9;
//        System.out.println( (++x!=y)&&(++x==y));//false &&具有短路功能，判断++x!=y为false后，不再继续判断++x==y的结果
//        System.out.println(x);//9

//        int x=8;
//        int y=9;
//        System.out.println( (++x!=y)&(++x==y));//false &没有短路功能，判断++x!=y为false后，继续判断++x==y的结果
//        System.out.println(x);//10

//        int x=8;
//        int y=9;
//        System.out.println((++x==y)||(++x!=y));//true ||具有短路功能，判断++x==y为true后，不再判断++x!=y的结果
//        System.out.println(x);//9

        int x=8;
        int y=9;
        System.out.println((++x==y)|(++x!=y));//true |没有短路功能，判断++x==y为true后，继续判断++x!=y的结果
        System.out.println(x);//10

        /*
        * &&和&的区别：
        *   &没有短路功能，不管&左边表达式的结果为true还是false，&右边表达式都要进行运算
        *   &&具有短路功能，当&&左边表达式结果为false的时候，直接判断&&运算结果为false，&&右边表达式结果不再进行运算
        *
        * ||和|的区别
        *   |没有短路功能，不管|左边表达式的结果为true还是false，|右边表达式都要进行运算
        *   ||具有短路功能，当||左边表达式结果为true的时候，直接判断||运算结果为true，||右边表达式结果不再进行运算
        *
        *
        * */



    }
}
