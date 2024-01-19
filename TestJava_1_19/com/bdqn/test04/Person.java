package bdqn.test04;

import java.util.Date;

public class Person {
    /*
    22：定义一个person类，
    属性如下：
    （1）身份证号，性别，姓名，年龄，户籍，出生日期（Data类型，需要引用Java.uitl.Data）
    功能：
    （2）自我介绍：介绍格式：（toString）
    身份证号+姓名+户籍
    （3）提供对象比较equals方法，只要身份证号+姓名相同就认为对象相等
     */
    private String id;
    private char gender;
    private String name;
    private int age;
    private String house;
    Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Person() {
    }

    public Person(String id, char gender, String name, int age, String house, Date date) {
        this.id = id;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.house = house;
        this.date = date;
    }

    //    （2）自我介绍：介绍格式：（toString）
    //    身份证号+姓名+户籍
    public String toString(){
        return "身份证号: "+id+", 姓名: "+name+", 户籍: "+house;
    }

    // （3）提供对象比较equals方法，只要身份证号+姓名相同就认为对象相等
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object instanceof Person person){
            return this.getId().equals(person.getId())&&this.getName().equals(person.getName());
        }
        return false;
    }
}
