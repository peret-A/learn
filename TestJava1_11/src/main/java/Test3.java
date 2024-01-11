import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //创建Scanner
        Scanner scanner=new Scanner(System.in);
        //定义长度为5的数组
        double[] money=new double[5];
        //输入数据
        for (int i = 0; i < money.length; i++) {
            System.out.print("第" + (i + 1) + "笔消费金额为:");
            money[i]=scanner.nextDouble();
        }
        //打印以及总结额
        double sum=0;
        System.out.println("序数   \t金额");
        for (int i = 0; i < money.length; i++) {
            System.out.println(i+"  \t\t"+money[i]);
            sum+=money[i];
        }

        System.out.println("总计   \t"+sum);
    }
}
