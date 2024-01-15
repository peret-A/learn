package com.bdqn.Dome;

public class Course {
    /*
    属性：课程名；学时；任课老师；
     */
    public String cname;
    public int time;
    public String tname;

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                ", time=" + time +
                ", tname='" + tname + '\'' +
                '}';
    }
}
