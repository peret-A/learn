package com.bdqn;

public class Test10 {
    /*
    使用do-while输出1000-2024年的闰年，每五次输出信息在一行
    注:编写时发生的错误，1.没有保证year在if外
                     2.没有\t的保证输出信息显示屏较乱
     */
    public static void main(String[] args) {
        //确定初试年份
        int year=1000;
        //计算
        int count=0;
        //进入循环
        do{
            //确定闰年
            if((year%4==0&&year%100!=0)||year%400==0){
                System.out.print("\t"+ year + "是闰年");
                count++;
                //确定5次信息然后执行换行
                if(count==5) {
                    System.out.println();
                    count = 0;
                }
            }
            year++;
        }while (year<=2024);
    }
}
