package bdqn;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    /*
    10：定义一个4行4列的二维数组，逐个从键盘输入值，将对角线的值清0
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        //定义一个4行4列的二维数组
        int[][] nums=new int[4][4];
        //输入数据
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=scanner.nextInt();
            }
        }
        //打印数据
        System.out.println("将对角线的值清0前");
        for (int[] x:nums){
            System.out.println(Arrays.toString(x));
        }
        //替换 fill方法
        for (int i = 0; i < nums.length; i++) {
                int j = i;
                Arrays.fill(nums[i],j,j+1,0);

        }
        //打印数据
        System.out.println("将对角线的值清0后");
        for (int[] x:nums){
            System.out.println(Arrays.toString(x));
        }
    }
}
