package com.bdqn;

public class Test4 {
    /*
    输出1-100之间的整数之和
     */
    public static void main(String[] args) {
        //循环初始值
        int i=1;
        //和
        int sum=0;
        //求1-100之和
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println("和为："+sum);
    }
}
