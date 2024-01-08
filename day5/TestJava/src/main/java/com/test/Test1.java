package com.test;

public class Test1 {
    /*
    01：求10以内的偶数的和。
     */
    public static void main(String[] args) {
        //用于定于循环变量
        int i=0;
        //sum用于求和
        int sum=0;
        for(i=0;i<=10;i++){
            //判断是否为偶数
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("求10以内的偶数的和:"+sum);
    }
}
