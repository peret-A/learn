package com.test;

public class Test7 {
    /*
    25：李白无事街上走，提壶去买酒。遇店加一倍，见花喝一斗，五遇花和店，喝光壶中酒，
    试问李白壶中原有多少斗酒？（使用for循环结构编程实现）
    提示：采用逆向思维分析问题。
     */
    public static void main(String[] args) {
        double sum=0;
        //五遇花和店 店与花依次交替
        //倒着看 先花再店
        for(int i=0;i<5;i++){

            sum=(sum+1)/2;
        }
        System.out.println("李白壶中原有" + sum + "斗酒");
    }
}
