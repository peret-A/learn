package com.test;

public class Test6 {
    /*
    06：求出1-3+5-7+9-…..101的和
     */
    public static void main(String[] args) {
        //定义循环变量
        int num;
        //sum用于计算和
        int sum=0;
        //用于计算加上正的和
        for(num=1;num<=101;num+=4){
            sum+=num;
        }
        //用于计算加上负的和
        for (num=3;num<=101;num+=4){
            sum-=num;
        }
        System.out.println("1-3+5-7+9-…..101的和"+sum);
    }
}
