package com.bdqn.Dome;

public class ComputerTest {
    /*
    07：定义一个计算机类：
属性：品牌；价格；颜色；
方法：（1）编程的功能  （2）上网的功能
实例化两个对象：“lenovo”；“hasee”
     */
    public static void main(String[] args) {
        Computer computer1=new Computer();
        Computer computer2=new Computer();
        computer1.brand="lenovo";
        computer2.brand="hasee";
        computer1.compile();
        computer2.compile();
        computer1.internet();
        computer2.internet();
    }
}
