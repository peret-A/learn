package com.test;

public class Test12 {
    /*
    12：随机生成一个五位以内的数，然后输出该数共有多少位，每位分别是什么
     */
    public static void main(String[] args) {
        //rand用于生成随机数
        int rand=(int)(Math.random()*100000);

        //rands用于备份
        int rands=rand;
        //count用于计算有多少位
        int count=0;
        //存储各位的数字
        int gewei=0,shiwei=0,baowei=0,qianwei=0,wanwei=0;
        while (true){
            //当条件满足时说明随机数完全取出
            if(rand==0){
              break;
            }else{
                count++;
            }
            rand/=10;
            }
        rand=rands;
        switch (count){
                case 5:
                    wanwei=rand/10000%10;
                case 4:
                    qianwei=rand/1000%10;
                case 3:
                    baowei=rand/100%10;
                case 2:
                    shiwei=rand/10%10;
                case 1:
                    gewei=rand%10;
                    break;
        }

            System.out.println(rand + "共有" + count + "位" + "每位为:万位:" + wanwei + " 千位:" + qianwei + " 百位:" + baowei + " 十位:" + shiwei + " 个位:" + gewei);

        }
    }

