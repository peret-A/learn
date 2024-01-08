package com.bdqn;

public class Test3 {
    /*
    输出1-100的偶数
     */
    public static void main(String[] args) {
        int i=1;
        while(i<=100){
            //判断是否为偶数
            if(i%2==0){
                System.out.println("i = " + i);
            }
            //改变条件初始数
            i++;
        }
    }
}
