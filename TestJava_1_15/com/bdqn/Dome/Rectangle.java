package com.bdqn.Dome;

public class Rectangle {
    /*
    在其中定义三个变量表示一个立方体的长、宽和高，定义一个方法求立方体的体积
     */
    public double length;
    public double height;
    public double weight;
    public void volume(){
        System.out.println("体积为:" + length * height * weight);
    }
}
