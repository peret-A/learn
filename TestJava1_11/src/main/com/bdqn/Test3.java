package bdqn;

import java.util.Scanner;
import java.util.Arrays;

public class Test3 {
    /*
    11：定义一个N*N二维数组，从键盘上输入值，找出每行中最大值组成一个一维数组并输出；
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入数组的N的长度");
        int line=scanner.nextInt();
        //定义数组
        int[][] nums=new int[line][line];
        //输入数据
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=scanner.nextInt();
            }
        }
        //找出每行中最大值组成一个一维数组并输出
        //定义行最大值的数组
        int[] nums_max=new int[line];
        for (int i=0;i<nums.length;i++){
            //假定每行的第一个最大
            nums_max[i]=nums[i][0];
            for (int k = 0; k < nums[i].length; k++) {
                //如果小于就将max的值换成较大的值
                if(nums_max[i]<nums[i][k]){
                    nums_max[i]=nums[i][k];
                }
            }
        }
        //打印数据
        System.out.println(Arrays.toString(nums_max));

    }
}
