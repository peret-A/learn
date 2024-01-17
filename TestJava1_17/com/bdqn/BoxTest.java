package com.bdqn;

public class BoxTest {
    /*
    使用有参构造方法创建一个对象，求给定尺寸的立方体的体积。
     */
    public static void main(String[] args) {
        Box box=new Box(2,3,4);
        System.out.println("长为2，宽为3，高为4的长方形的体积为:" + box.volue());
    }
}
