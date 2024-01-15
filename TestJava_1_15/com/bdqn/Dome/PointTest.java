package com.bdqn.Dome;

public class PointTest {
    /**
     * 04：       0——————>X
     *           |
     *           |
     *           |          P(X,Y)
     *           |
     *           |
     *           Y
     * 定义一个类，用于描述坐标点
     * （1）具有计算当前点到原点距离的功能
     * （2）求到任意一点（m，n）的距离
     * （3）具有坐标点显示功能，显示格式（x，y）
     */
    public static void main(String[] args) {
        Point point=new Point();
        point.x=2;
        point.y=2;
        //具有计算当前点到原点距离的功能 有返回值要接收
        System.out.println(point.backSquare());
        //求到任意一点（m，n）的距离有返回值要接收
        System.out.println(point.Space(4, 4));
        //具有坐标点显示功能，显示格式（x，y） 无返回值
        point.print();
    }
}
