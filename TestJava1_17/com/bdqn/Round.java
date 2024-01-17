package com.bdqn;

public class Round {
    /*
    06：定义一个圆类型
    属性：半径
    提供无参的构造方法和一个有参的构造方法
    提供显示圆周长功能的方法
    提供显示圆面积的方法
    使用有参构造方法创建一个对象并计算圆的周长和面积。
     */
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Round() {
    }

    public Round(double radius) {
        this.radius = radius;
    }

    //提供显示圆周长功能的方法
    public double girth(){
        return Math.PI*radius*2;
    }
    //  提供显示圆面积的方法
    public double area(){
        return Math.PI*radius*radius;
    }
}
