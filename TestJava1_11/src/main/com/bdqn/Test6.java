package bdqn;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
    /*
    08：定义一个3行4列的二维数组，逐个从键盘输入值，编写程序将四周的数据清0
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        //定义一个3行4列的二维数组
        int[][] nums=new int[3][4];
        //输入数据
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=scanner.nextInt();
            }
        }
        //打印数据
        System.out.println("将四周的数据清0前");
        for (int[] x:nums){
            System.out.println(Arrays.toString(x));
        }
        //将四周的数据清0
        //方法fill
        //经观察无论行或者列等于0  或者 最后一行或者最后一列都要替换成0
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(i==0||j==0||
                        i==nums.length-1||j==nums[i].length-1){
                    Arrays.fill(nums[i],j,j+1,0);
                }
            }
        }
        //打印数据
        System.out.println("将四周的数据清0后");
        for (int[] x:nums){
            System.out.println(Arrays.toString(x));
        }
    }
}
