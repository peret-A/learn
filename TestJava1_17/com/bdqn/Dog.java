package com.bdqn;

public class Dog {
    /*
    01：设计一个Dog类，有名字、颜色和年龄属性，提供无参的构造方法和一个有参的构造方法，定义输出方法show()显示其信息。
    使用有参构造方法创建一个对象，并输出该对象的信息。
     */
    private String name;
    private String color;
    private int age;

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    //义输出方法show()显示其信息。
    public void show(){
        System.out.println("小狗名字：" + name + ",小狗颜色:" + color + ",小狗年龄:" + age);
    }

}
