package com.bdqn;

public class RoundTest {
    /*
      使用有参构造方法创建一个对象并计算圆的周长和面积。
     */
    public static void main(String[] args) {
        Round round=new Round(2);
        System.out.println("半径为2的圆的周长:" + round.girth());
        System.out.println("半径为2的圆的面积:" + round.area());
    }
}
