package com.test;

public class Test1 {
    /*
    31：设计Java程序，假设有50瓶饮料，喝完3个空瓶可以换一瓶饮料，依次类推，请问总共喝了多少瓶饮料？
     */
    public static void main(String[] args) {
        //drink为饮料  empty为空瓶
        int drink=50;
        int empty=0;
        //count为喝了多少瓶
        int count=0;
        while (true){
            //喝了多少
            count=drink+count;
            //未兑换前空瓶数
            empty+=drink;
            //剩余多少
            drink=empty/3;
            if(drink+empty<3){
                break;
            }
            empty=empty-drink*3;
        }
        //加上不足三瓶的量
        count+=drink;
        System.out.println("共喝了"+count+"瓶饮料");
    }
}
