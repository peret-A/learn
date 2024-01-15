package com.bdqn.Dome;

public class CircleTest {
    /*
    05：定义一个圆类型
提供显示圆周长功能的方法
提供显示圆面积的方法
     */
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.r=2;
        //提供显示圆周长功能的方法
        circle.girth();
        //提供显示圆面积的方法
        circle.are();
    }
}
