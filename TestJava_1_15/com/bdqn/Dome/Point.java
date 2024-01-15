package com.bdqn.Dome;

public class Point {
    public double x;
    public double y;
    //（1）具有计算当前点到原点距离的功能
    public double backSquare(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    //（2）求到任意一点（m，n）的距离
    public double Space(double m,double n){
        //不用考虑x-m 或者y-n是正数还是负数 平方之后一定为正
        return Math.sqrt(Math.pow((x-m),2)+Math.pow((y-n),2));
    }

    //（3）具有坐标点显示功能，显示格式（x，y）
    public void print(){
        System.out.println("(" + x + "," + y + ")");
    }
}
