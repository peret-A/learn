package com.bdqn;

public class Car {
    /*
    03：写一个汽车类：
    属性：品牌；车长；颜色；价格；
    提供无参的构造方法和一个有参的构造方法
    使用有参构造方法创建五个对象：“捷达”，“宝马”，“劳斯莱斯”，“科鲁兹”，“迈锐宝”
     */
    private String brand;
    private double lenght;
    private String color;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car() {
    }

    public Car(String brand, double lenght, String color, double price) {
        this.brand = brand;
        this.lenght = lenght;
        this.color = color;
        this.price = price;
    }
}
