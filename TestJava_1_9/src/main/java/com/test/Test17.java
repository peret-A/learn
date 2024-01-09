package com.test;

import java.util.Scanner;

public class Test17 {
    /*
    15：实现双色球的彩票功能。规则：从36个红球中随机选择不重复的6个数，从15个篮球中随机选择1个组成一注彩票。可以选择买多注。
     */
    public static void main(String[] args) {
        //记录随机数字
        long numL=0;
        int i;
        //从36个红球中随机选择不重复的6个数
        for (i = 0; i < 6; i++) {
            int numRed=(int)(Math.random()*36+1);
            numL+=(long) Math.pow(10,i*2)*numRed;
        }
        //，从15个篮球中随机选择1个

            int numBlue=(int)(Math.random()*15+1);
        numL+=(long) Math.pow(10,i*2)*numBlue;
        System.out.println("购买的彩票为:" + numL);
    }
}
