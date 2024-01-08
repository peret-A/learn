package com.bdqn.demo04;

import java.util.Scanner;

public class Demo11 {

    /*
    *需求说明
    * 键盘输入四位数字的会员卡号
    * 使用“/”和“%”运算符分解获得会员卡各个位上的数字
    * 将各个位上数字求和
    * 根据分解后的数字之和，判断用户是否中奖。如果数字之和大于20，则中奖
     * */

    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner = new Scanner(System.in);

        //获取键盘输入的4位数字会员卡号
        System.out.println("请输入4位会员卡号：");
        int cardNum=scanner.nextInt();
        System.out.println("你的会员卡号是："+cardNum);

        //使用“/”和“%”运算符分解获得会员卡各个位上的数字
        int geWei =cardNum%10;
        int shiWei = cardNum/10%10;
        int baiWei =cardNum/100%10;
        int qianWei =cardNum/1000;
        System.out.println("千位："+qianWei+"，百位："+baiWei+"，十位："+shiWei+"，个位："+geWei);

        //将各个位上数字求和
        int sum =geWei+shiWei+baiWei+qianWei;
        System.out.println("你的会员卡各个位上的数字之和为："+sum);

        //根据分解后的数字之和，判断用户是否中奖。如果数字之和大于20，则中奖
        String result =sum>20?"恭喜你，中奖了":"很遗憾，没有中奖";
        System.out.println(result);
    }
}
