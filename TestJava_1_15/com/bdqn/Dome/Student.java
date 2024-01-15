package com.bdqn.Dome;

public class Student {
    /*
     （1）具有属性：学号、姓名、年龄、性别、专业。
     * （2）具有方法：自我介绍，负责输出该学员的姓名、年龄、性别以及专业。
     */
    public int id;
    public String name;
    public int age;
    public String gender;
    public String depat;
    //自我介绍
    public void introduce(){
        System.out.println("我的学号为:" + id + ",我叫:" + name + ",我现在:" + age + ",我是" + gender + ",我是" + depat + "专业");
    }
}
