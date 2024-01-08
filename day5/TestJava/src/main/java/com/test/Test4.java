package com.test;

public class Test4 {
    /*
        04：写一个方法，此方法实现输出100-999之间的水仙花数。
     */
    public static void main(String[] args) {
        //循环初始化
        int num=100;
        for(; num<1000; num++){
            //水仙花数是各位的数字的三次方和等于本身
            if(Math.pow(num%10,3)+Math.pow(num/10%10,3)+Math.pow(num/100%10,3)==num){
                System.out.println(num + "是水仙花数");
            }
        }
    }
}
