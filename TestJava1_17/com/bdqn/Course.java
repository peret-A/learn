package com.bdqn;

public class Course {
    /*
    04：写一个课程类：
    属性：课程名；学时；任课老师；
    提供无参的构造方法和一个有参的构造方法
    使用有参构造方法创建五个对象：“c语言”，“Java编程”，“php网络编程”，“c++”，“数据结构”
     */
    private String courseName;
    private int time;
    private String teacherName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Course() {
    }

    public Course(String courseName, int time, String teacherName) {
        this.courseName = courseName;
        this.time = time;
        this.teacherName = teacherName;
    }
}
