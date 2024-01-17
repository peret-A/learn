package com.bdqn;

public class PointTest {
    public static void main(String[] args) {
        Point point=new Point(2,2);
        System.out.println("(2,2)到原点的距离是:" + point.backSquare());
        System.out.println("(2,2)到（4，4）的距离是:" + point.backBegin(4, 4));
        point.print();
    }
}
