package com.bdqn.Dome;

public class CarTest {
    /**
     * 02：写一个汽车类：
     * 属性：品牌；车长；颜色；价格；
     * 方法：跑的方法
     * 创建五个对象：“捷达”，“宝马”，“劳斯莱斯”，“科鲁兹”，“迈锐宝”
     */
    public static void main(String[] args) {
        Car car1=new Car();
        car1.brand="捷达";
        car1.length=1.8;
        car1.color="黑色";
        car1.price=18.6;
        car1.running();
        Car car2=new Car();
        car2.brand="宝马";
        car2.length=1.8;
        car2.color="黑色";
        car2.price=18.6;
        car2.running();
        Car car3=new Car();
        car3.brand="劳斯莱斯";
        car3.length=1.8;
        car3.color="黑色";
        car3.price=18.6;
        car3.running();
        Car car4=new Car();
        car4.brand="科鲁兹";
        car4.length=1.8;
        car4.color="黑色";
        car4.price=18.6;
        car4.running();
        Car car5=new Car();
        car5.brand="迈锐宝";
        car5.length=1.8;
        car5.color="黑色";
        car5.price=18.6;
        car5.running();
    }
}
