import java.math.BigDecimal;
import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        int x = 1;
        int y = 12;
        x += 2;
        y -= 3;
        System.out.println("x= "+x+" y= "+y);
        y/=x;
        System.out.println("x= "+x+" y= "+y);
        y++;
        y %= x;
        System.out.println("x= "+x+" y= "+y);



//        int n =3;
//        int m=4;
//        System.out.println("n<m is = " + (n < m));
//        System.out.println("n=m is = " + (++n < m));
//        System.out.println("n>m is = " + (++n > m));
//        System.out.println("n is = " + n);


//        int a = 5+4;
//        int b = a*2;
//        int c = b/4;
//        int d = b-c;
//        int e = -d;
//        int f = e%4;
//        double g = 18.4;
//        double h = g%4;
//        int i = 3;
//        int j = i++;
//        int k = ++i;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//        System.out.println("e = " + e);
//        System.out.println("f = " + f);
//        System.out.println("g = " + g);
//        System.out.println("h = " + h);
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
//        System.out.println("k = " + k);


//        Scanner in = new Scanner(System.in);
//        //输入华氏摄氏度
//        double temperature=in.nextDouble();
//        TherMometer therMometer = new TherMometer();
//        //得到摄氏度
//        double ther=therMometer.conversion(temperature);
//        BigDecimal two = new BigDecimal(ther);
//        double three = two.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
//        System.out.println("摄氏度="+three);

//        Calculator calculator=new Calculator();
//        System.out.println(calculator.add("1", "2"));
//        System.out.println(calculator.sub("1", "2"));
//        System.out.println(calculator.mul("1", "2"));
//        System.out.println(calculator.div("1", "2"));

    }
}