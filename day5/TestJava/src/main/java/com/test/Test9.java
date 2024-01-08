package com.test;

public class Test9 {
    /*
    09：打印出1000-2000年中所有的闰年，并以每行四个数的形式输出
     */
    public static void main(String[] args) {
        //定义循环变量
        int year;
        //count用于计算4个一行
        int count=0;
        for (year=1000;year<=2000;year++){
            //判断是否为闰年
            if(year%4==0&&year%100!=0||year%400==0){
                System.out.print("\t"+year + "是闰年 ");
                count++;
                if(count==4){
                    System.out.println();
                    count=0;
                }
            }
        }
    }
}
