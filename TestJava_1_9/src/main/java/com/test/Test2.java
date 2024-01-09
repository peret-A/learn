package com.test;

public class Test2 {
    /*
    30：用100元人民币兑换10元，5元，1元的纸币（每种都要有）共50张，计算有多少种兑换方案
     */
    public static void main(String[] args) {
         int onem=0;
         int fivem=0;
         int tenm=0;
         for(onem=0;onem<=50;onem++){
             for(fivem=0;fivem<=20;fivem++){
                 for(tenm=0;tenm<=10;tenm++){
                     if(onem+5*fivem+10*tenm==100&&onem+fivem+tenm==50){
                         System.out.println("10元:" + tenm + "张,5元:" + fivem + "张，一元:" + onem+"张");
                     }
                 }
             }
         }
    }
}
