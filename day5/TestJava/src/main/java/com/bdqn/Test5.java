package com.bdqn;

public class Test5 {
    /*
    计算1-100的偶数之和
     */
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=100){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("sum = " + sum);
    }
}
