package bdqn;

import java.util.Scanner;

public class Test2 {
    /*
    02：求一个3*3矩阵对角线元素之和
    <提示>程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。
     */
    public static void main(String[] args) {
        //定义一个一个3*3矩阵
        int[][] nums=new int[3][3];
        //求和
        int sum=0;
        //输入数据
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=scanner.nextInt();
            }
        }
        //打印矩阵
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        for (int i=0,j=0;i<nums.length&&j<nums[0].length;i++,j++){
           sum+=nums[i][j];
        }
        System.out.println("对角线元素之和:" + sum);
    }
}
