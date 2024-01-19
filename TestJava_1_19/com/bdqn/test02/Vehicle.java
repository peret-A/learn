package bdqn.test02;

public class Vehicle {
    /*
    27：编写一个Java应用程序，设计一个汽车类Vehicle，包含的属性有车轮个数wheels和车重weight。
    小车类Car是Vehicle的子类，其中包含的属性有载人数loader。卡车类Truck是Car类的子类，其中包含的属性有载重量payload。（20分）
    （1）每个类都有构造方法进行属性初识化
    （2）每个类都输出相关数据的toString方法
    （3）使用Test类中的main方法定义各类初始化数据后台打印相关数据
     */
    private int wheels;
    private double weight;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vehicle() {
    }

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }
    public String toString(){
        return "车轮个数： "+this.getWheels()+"车重: "+this.getWeight();
    }
}
