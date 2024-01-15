package com.bdqn.Dome;

public class StudentTest {
    /**
     * 08：编写一个类Student，代表学员，要求：
     * （1）具有属性：学号、姓名、年龄、性别、专业。
     * （2）具有方法：自我介绍，负责输出该学员的姓名、年龄、性别以及专业。
     */
    public static void main(String[] args) {
        Student student=new Student();
        student.id=1001;
        student.name="张三";
        student.age=18;
        student.gender="男";
        student.depat="计算机";
        student.introduce();
    }
}
