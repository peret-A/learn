package com.bdqn.Dome;

public class Circle {
    /*
    提供显示圆周长功能的方法
提供显示圆面积的方法
     */
    public double r;
    //提供显示圆周长功能的方法
    public void girth(){
        System.out.println("周长为:" + (2 * r * Math.PI));
    }
    //提供显示圆面积的方法
    public void are(){
        System.out.println("面积为:" + Math.PI * r * r);
    }
}
