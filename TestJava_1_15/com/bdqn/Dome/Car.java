package com.bdqn.Dome;

public class Car {
    /*
    属性：品牌；车长；颜色；价格；
      方法：跑的方法
     */
    public String brand;
    public double length;
    public String color;
    public double price;
    public void running(){
        System.out.println("品牌为" + brand + ",车长为" + length + ",颜色" + color + ",价格" + price+"正在行驶中");
    }
}
