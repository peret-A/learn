package com.bdqn;

public class Box {
    /*
    07：编程创建一个Box类，在其中定义三个变量表示一个立方体的长、宽和高，定义一个方法求立方体的体积。
    提供无参的构造方法和一个有参的构造方法
    使用有参构造方法创建一个对象，求给定尺寸的立方体的体积。
     */
    private double lenght;
    private double wight;
    private double height;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Box() {
    }

    public Box(double lenght, double wight, double height) {
        this.lenght = lenght;
        this.wight = wight;
        this.height = height;
    }
    //定义一个方法求立方体的体积。
    public double volue(){
        return lenght*wight*height;
    }
}
