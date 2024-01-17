package com.bdqn;

public class Point {
    /*
    05：       0——————>X
          |
          |
          |          P(X,Y)
          |
          |
          Y
    定义一个类，用于描述坐标点。
    （1）提供无参的构造方法和一个有参的构造方法
    （2）具有计算当前点到原点距离的功能
    （3）求到任意一点（m，n）的距离
    （4）求到任意一点（Point p）的距离
    （5）具有坐标点显示功能，显示格式（x，y）
     */
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //具有计算当前点到原点距离的功能
    public double backSquare(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }

    //求到任意一点（m，n）的距离
    public double backBegin(double m,double n){
        return Math.sqrt(Math.pow((m-x),2)+Math.pow((n-y),2));
    }
    //具有坐标点显示功能，显示格式（x，y）
    public void print(){
        System.out.println("(" + x + "," + y + ")");
    }

}
