package com.test;

public class Test3 {
    /*
    29：将100元兑换为1元、5元、10元的零钱，请问有多少种兑换方法？
     */
    public static void main(String[] args) {
        int onem=0;
        int fivem=0;
        int tenm=0;
        //计算有多少种
        int count=0;
        for(onem=0;onem<=50;onem++){
            for(fivem=0;fivem<=20;fivem++){
                for(tenm=0;tenm<=10;tenm++){
                    if(onem+5*fivem+10*tenm==100){
                        System.out.println("10元:" + tenm + "张,5元:" + fivem + "张，一元:" + onem+"张");
                        count++;
                    }
                }
            }
        }
        System.out.println("有:"+count+"种");
    }
}
