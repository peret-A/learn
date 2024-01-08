package com.test;

import java.util.Scanner;

public class Test3 {
    /*
    03：随机产生一个1-100之间的整数，看能几次猜中。要求：猜的次数不能超过7次，每次猜完之后都要提示“大了”或者“小了”。
     */
    public static void main(String[] args) {
        //创建Scanner用于输入数据
        Scanner scanner=new Scanner(System.in);
        //count用于统计猜的次数
        int count=0;
        //rand用于生成随机数
        int rand=(int)(Math.random()*100+1);
        //guess用于猜数字
        int guess;
        while (count<7){
            System.out.print("输入猜的数字:");
            guess=scanner.nextInt();
            if(guess<rand){
                System.out.println("小了");
            }else if(guess>rand){
                System.out.println("大了");
            }else{
                System.out.println("中了");
                break;
            }
        }
    }
}
