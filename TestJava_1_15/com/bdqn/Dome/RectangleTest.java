package com.bdqn.Dome;

public class RectangleTest {
    /**
     * 06：编程创建一个Box类，
     * 在其中定义三个变量表示一个立方体的长、宽和高，定义一个方法求立方体的体积。创建一个对象，求给定尺寸的立方体的体积。
     */
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.weight=2;
        rectangle.height=2;
        rectangle.length=2;
        rectangle.volume();
    }
}
