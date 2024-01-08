package com.test;

public class Test11 {
    /*
    11：A、B、C、D分别为0——9之间的整数，求出满足AB+CD=DA条件的数。
    例如：90+09=99
     */
    public static void main(String[] args) {
        //定义变量a，b,c,d
        int a,b,c,d;
        for (a=0;a<10;a++){
            for(b=0;b<10;b++){
                for (c=0;c<10;c++){
                    for (d=0;d<10;d++){
                        //判断是否满足AB+CD=DA
                        if(a*b+c*d==a*d){
                            System.out.println("\t" + a + "*" + b + "+" + c + "*" + d + "=" + a + "*" + d);
                        }
                    }
                }
            }
        }
    }
}
