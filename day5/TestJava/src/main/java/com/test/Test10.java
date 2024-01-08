package com.test;

public class Test10 {
    /*
    10：定义两个整数a、b，a、b的取值范围在0-9之间，给出所有符合a+b=12的组合。
     */
    public static void main(String[] args) {
        //定义变量a，b
        int a,b;
        for (a=0;a<10;a++){
            for (b=0;b<10;b++){
                //判断是否满足a+b=12
                if(a+b==12){
                    System.out.println("\t" + a + "+" + b + "=12");
                }
            }
        }
    }
}
