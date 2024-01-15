package com.bdqn.Dome;

public class CourseTest {
    /**
     * 03：写一个课程类：
     * 属性：课程名；学时；任课老师；
     * 创建五个对象：“c语言”，“Java编程”，“php网络编程”，“c++”，“数据结构”
     */
    public static void main(String[] args) {
        Course course1=new Course();
        course1.cname="c语言";
        course1.time=24;
        course1.tname="张老师";
        Course course2=new Course();
        course2.cname="Java编程";
        course2.time=24;
        course2.tname="张老师";
        Course course3=new Course();
        course3.cname="php网络编程";
        course3.time=24;
        course3.tname="张老师";
        Course course4=new Course();
        course4.cname="c++";
        course4.time=24;
        course4.tname="张老师";
        Course course5=new Course();
        course5.cname="数据结构";
        course5.time=24;
        course5.tname="张老师";
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());
        System.out.println(course4.toString());
        System.out.println(course5.toString());
    }
}
