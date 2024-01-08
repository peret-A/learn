package com.test;

public class Test13 {
    /*
    13：输出九九乘法表
     */
    public static void main(String[] args) {
        //定义循环变量
        int i,j;
        for(i=1;i<10;i++){
            for(j=i;j<10;j++){
                System.out.print("\t"+i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
