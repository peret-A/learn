package com.bdqm;
//定义实现一个计算器类
//目的完成加减乘除以及取余
public class Calculator {
    //定义整形的相加
    public int add(int x,int y){
        return x+y;
    }
    //定义两个整数的相减
    public int sub(int x,int y){
        return add(x,-y);
    }

    //定义两个整数的相乘
    public int mul(int x,int y) {
        return x*y;
    }
    //定义两个整数的相除
    //注：不能调用mul方法，如mul(x,1/y); 传入的形参y会丢失精度
    public int div(int x,int y){
        //要排除y为0的情况
        if(y==0)
            return 0;


        return  x/y;
    }

    //定义两个整数取余
    public int takeover(int x,int y){
        //要排除y为0的情况
        if(y==0)
            return 0;
        return x%y;
    }

    public double takeover(double x,int y){
        //要排除y为0的情况
        if(y==0)
            return 0;
        return x%y;
    }


}
