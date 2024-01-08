import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {




//        Scanner in =new Scanner(System.in);
//        System.out.println("输入数字");
//        int num=in.nextInt();
//        if(test1(num)>20){
//            System.out.println("中奖了");
//        }
//        else
//            System.out.println("没有");




//        int num1=100;
//        int num2=200;
//        int num3=num1>num2?num1:num2;
//        System.out.println(num3);


//        int num1=100;
//        int num2=200;
//        boolean result= num1>num2 || num2<num1;
//        System.out.println(result);
//        int num3=num1 & num2;
//        System.out.println(num3);
//        int num4=num1 | num2;
//        System.out.println(num4);


//        //输入卡号 计算个位置之和
//        //创建Scanner对象
//        Scanner in =new Scanner(System.in);
//        //输入卡号
//        System.out.println("输入卡号");
//        int num=in.nextInt();
//        System.out.println("卡号 = " + num);
//        test1(num);
    }

    public static int test1(int num){
        int sum=0;
        //如果num>0 就说明没有完全取出
        while(num>0){
            //取出个位数 放到sum
            sum+=num%10;
            //去掉取出的个位数
            num/=10;
        }
        return sum;

    }
}
