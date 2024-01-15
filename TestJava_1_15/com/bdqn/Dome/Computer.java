package com.bdqn.Dome;

public class Computer {
    /*
    属性：品牌；价格；颜色；
方法：（1）编程的功能  （2）上网的功能
     */
    public String brand;
    public double price;
    public String color;
    //编程的功能
    public void compile(){
        System.out.println(brand + "正在编译");
    }
    //上网的功能
    public void internet(){
        System.out.println(brand + "正在上网");
    }
}
