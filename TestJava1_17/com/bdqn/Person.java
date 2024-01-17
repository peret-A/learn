package com.bdqn;

public class Person {
    /*
    02：写一个人的类
    属性：名字，性别，年龄；提供无参的构造方法和一个有参的构造方法
    方法：（1）自我介绍的方法（2）吃饭的方法
    使用有参构造方法创建一个对象：姓名为“张三”，性别为“男”，年龄25.
     */
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //（1）自我介绍的方法
    public void show(){
        System.out.println("名字:" + name + ",性别" + gender + ",年龄" + age);
    }
    //（2）吃饭的方法
    public void eat(){
        System.out.println("用筷子吃饭");
    }
}
