package com.test;

import java.util.Scanner;

public class Test18 {
    /*
    14：使用Java实现输出如下图形。
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入行数");
        //设置行数
        int row=scanner.nextInt();
        //三角形
        System.out.println("三角形");
        for(int i=1;i<=row;i++){
            //打印每行的空格
            for (int j = 1; j <=row-i ; j++) {
                System.out.print(" ");
            }
            //打印每行的*

            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }

        //第二个图形
        System.out.println("第二个图形");
        for(int i=1;i<=(row+1)/2;i++){
            //打印每行的空格
            for (int j = 1; j <=(row+1)/2-i ; j++) {
                System.out.print(" ");
            }
            //打印每行的*

            for (int j = 1; j <= 5+2*i-1; j++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
        for(int i=row/2;i>=1;i--){
            //打印每行的空格
            for (int j = row/2-i; j >= 0; j--) {
                System.out.print(" ");
            }
            //打印每行的*

            for (int j =5+2*i-1; j >= 1; j--) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }

        //第三个图形
        System.out.println("第三个图形");
        for(int i=1;i<=(row+1)/2;i++){
            //打印每行的空格
            for (int j = 1; j <=(row+1)/2-i ; j++) {
                System.out.print(" ");
            }
            //打印每行的*
            if(i==1){
                System.out.print("*");
            }else {
                System.out.print("*");
                for (int j = 1; j <= i * 2 - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
        for(int i=row/2;i>=1;i--){
            //打印每行的空格
            for (int j = row/2-i; j >=0 ; j--) {
                System.out.print(" ");
            }
            //打印每行的*
            if(i==1){
                System.out.print("*");
            }else {
                System.out.print("*");
                for (int j = 1; j <= i * 2 - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            //换行
            System.out.println();
        }



        //第四个图形
        System.out.println("第四个图形");
        for (int i = 0; i <row ; i++) {
          //第一行 特殊
            if(i==0){
                for(int j=0;j<row*2-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for (int j = 0; j < row-i; j++) {
                    System.out.print("*");    
                }
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < row-i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }
}
