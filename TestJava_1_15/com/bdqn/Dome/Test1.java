package com.bdqn.Dome;

public class Test1 {
    /**
     * 01：写一个人的类
     * 属性：名字，性别，年龄
     * 方法：（1）自我介绍的方法（2）吃饭的方法
     * 创建一个对象“张三”
     */
    public static void main(String[] args) {
        Person person=new Person();
        person.name="张三";
        person.gender="男";
        person.age=18;
        //自我介绍的方法
        person.introduce();
        //吃饭的方法
        person.eating();
    }
}
