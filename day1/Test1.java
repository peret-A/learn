import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int a=in.nextInt(12);
        System.out.println(a);
        //声明8大基本数据类型
//    byte i1=1;
//    short i2=2;
//    int i3=3;
//    long i4=4L;//整数类型默认为int 用l或者L来标识long类型
//    float i5=12.5f;
//    double i6=13.5;
//    char i7='h';
//    boolean i8=true;


        //
//        byte i=20;
//        System.out.println(i);


//        Integer i1 =100;
//        Integer i2 =100;
//        Integer i3 = 200;
//        Integer i4 = 200;
//        System.out.println(i1);
//        //取i1地址，
//        System.out.println(Integer.toHexString(i1.hashCode()));
//        System.out.println(i2);
//        //取i2地址，
//        System.out.println(Integer.toHexString(i2.hashCode()));
//        //取i3地址，
//        System.out.println(i3);
//        System.out.println(Integer.toHexString(i3.hashCode()));
//
//        //取i4地址，
//        System.out.println(i4);
//        System.out.println(Integer.toHexString(i4.hashCode()));
//        System.out.println(i3==i4);
        //结果都是64，证明Integer是静态池，如果值是在-128到127之间 地址是固定
        //i1==i2
        //因为i1，i2并没有申请空间所有他们比较的是地址不是内容
        //                Integer i3 = 200;
        //                Integer i4 = 200;
        //i3==i4
        //他们的值大于范围，所以会自动申请空间
        //所以他们的值是false.
    }




//    public static void main(String[] args) {
//
//                Integer i1 = 100;
//                Integer i2 = 100;
//                Integer i3 = 200;
//                Integer i4 = 200;
//
//                System.out.println(i1==i2);
//                System.out.println(i3==i4);
//    }
}
