package com.test;

public class Test2 {
    /*
    02：求100以内的所有素数
（素数：一个大于1的自然数，除了1和它本身外，不能被其他自然数整除）
     */
    public static void main(String[] args) {
        //定义循环变量
        int i=0;
        int j=0;
        for(i=2;i<=100;i++){
            for(j=2;j<=i;j++){
                //如果满足说明可以被整除，且不是本身则不是素数

                if(i%j==0&&j!=i){
                    break;
                }else if(i==j){
                    System.out.println(i + "是素数");
                }
            }
        }
    }
}
