package com.test;

public class Test8 {
    /*
    08：输出20-80之间能被3整除的整数，每5个一行
     */
    public static void main(String[] args) {
        //定义循环变量
        int num;
        //count用于计算5个一行
        int count=0;
        for(num=20;num<=80;num++){
            //能被3整除
            if(num%3==0){
                System.out.print(num+" ");
                count++;
                if(count==5){
                    System.out.println();
                    count=0;
                }
            }
        }
    }
}
