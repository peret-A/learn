package com.test;

public class Test7 {
    /*
    07：求出1-1/2+1/3-1/4…..1/100的和
     */
    public static void main(String[] args) {
        //定义循环变量
        int num;
        //sum用于计算和
        double sum=0;
        //用于计算加上正的和
        for(num=1;num<=100;num+=2){
            //1.0的作用是将1/num变成double型
            sum+=(1.0/num);
        }
        //用于计算加上负的和
        for (num=3;num<=100;num+=2){
            sum-=(1.0/num);
        }
        System.out.println("1-1/2+1/3-1/4…..1/100的和"+sum);
    }
}
