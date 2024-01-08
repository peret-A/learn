package com.bdqn;

import java.util.Scanner;

public class Test6 {
    /*
     *输出水仙花数
     */
    public static void main(String[] args) {
        int i=100;
        //水仙花数是指各位的数字的三次方之和等于他本省
        while (i<1000){
            if(Math.pow(i%10,3)+
                    Math.pow(i/10%10,3)+
                    Math.pow(i/100,3)==i){
                System.out.println("水仙花数 = " + i);
            }
            //迭代
            i++;
        }
    }
}
