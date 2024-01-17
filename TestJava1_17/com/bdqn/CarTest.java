package com.bdqn;

public class CarTest {
    public static void main(String[] args) {
        String[] str={"捷达","宝马","劳斯莱斯","科鲁兹","迈锐宝"};
        Car[] cars=new Car[5];
        for (int i = 0; i < cars.length; i++) {
            cars[i]=new Car();
            cars[i].setBrand(str[i]);
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].getBrand());
        }
    }
}
