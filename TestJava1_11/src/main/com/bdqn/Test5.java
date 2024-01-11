package bdqn;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    /*
    09：定义一个3行4列的二维数组，逐个从键盘输入值，将左下三角的值清0
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
        //方法tostring
        System.out.println("左下三角的值替换成0前");
        for(int[] x:nums){
            System.out.println(Arrays.toString(x));
        }
        //将左下三角的值清0
        //使用fill将左下三角的值替换成0
        //经观察第一行不替换 第二行第一个替换 第三行前两替换 以此可得到结论 替换与行有关
        for (int i = 0,j = 0; i < nums.length; i++) {
                Arrays.fill(nums[i],j,i,0);
        }
        //打印数据
        //方法tostring
        System.out.println("左下三角的值替换成0后");
        for(int[] x:nums){
            System.out.println(Arrays.toString(x));
        }
    }
}
