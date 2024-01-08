package com.test;

import java.util.Scanner;

public class Test14 {
    /*
    14：使用Java实现输出如下图形。
    未完成
     */
    public static void main(String[] args) {
        //三角形
        //循环变量
        int i=0,j=0,z=0;
        //创建scanner
        Scanner scanner=new Scanner(System.in);
        //行
        int row=scanner.nextInt();
//        for(i=1;i<=row;i++){
//            for (j=row-i;j>0;j--){
//                System.out.print(" ");
//            }
//            for (z=0;z<2*i-1;z++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (i=1;i<row;i++){
            if(i<=row/2){
                for (j=row/2-i;j>0;j--){
                    System.out.println(" ");
                }
                for (z=row/2;z<row/2+2*i-2;z++){
                    System.out.println("*");
                }
            }else{

            }

        }
    }
}
