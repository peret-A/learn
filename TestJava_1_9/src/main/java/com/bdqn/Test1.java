package com.bdqn;

public class Test1 {
    /*
    九九乘法表
     */
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print("\t"+i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
