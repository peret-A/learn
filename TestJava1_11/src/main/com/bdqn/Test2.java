package bdqn;

import java.util.Scanner;

public class Test2 {
    /*
    12：从键盘上输入一个 3*4 的整型数组，求出其中的最大值和最小值，并显示出
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        //定义一个 3*4 的整型数组
        int[][] nums=new int[3][4];
        //输入数据
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=scanner.nextInt();
            }
        }
        // 默认max min为最大值，最小值
        int max=nums[0][0];
        int min=nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
               if(nums[i][j]>max){
                   max=nums[i][j];
               }
                if(nums[i][j]<min){
                    min=nums[i][j];
                }
            }
        }
        System.out.println("其中的最大值和最小值分别为" + max +" "+ min);
    }
}
