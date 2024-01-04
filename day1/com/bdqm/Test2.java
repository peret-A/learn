package com.bdqm;

public class Test2 {
    public static void main(String[] args) {
//        使用变量存储数据，实现个人简历信息的输出
        String name="小明";         //学员姓名
        short age=35;              //学员年龄
        int time=3;                //工作时间
        int num=5;                 //项目个数
        String depart="Java";      //技术方向
        String hobby="篮球";        //爱好
        System.out.println("这个同学的姓名是:" + name);
        System.out.println("年龄是:" + age);
        System.out.println("工作了" + time + "年了");
        System.out.println("做过了" + num + "个项目");
        System.out.println("技术方向是" + depart);
        System.out.println("兴趣爱好是:" + hobby);
    }

}
