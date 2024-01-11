package bdqn;

import java.util.Arrays;
import java.util.Scanner;

public class Test7 {
    /*
    07：定义一个4行4列的二维数组，逐个从键盘输入值，然后将第1行和第4行的数据进行交换，将第2行和第3行的数据进行交换
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
        System.out.println("交换前");
        for (int[] x:nums){
            System.out.println(Arrays.toString(x));
        }
        //然后将第1行和第4行的数据进行交换，将第2行和第3行的数据进行交换
        //方法cpoyOf
        int[][] nums_bak=new int[4][4];
        for (int i = 0; i < nums_bak.length; i++) {
            nums_bak[i]= Arrays.copyOf(nums[i],4);
        }
        //注：如果直接用copyOf方法去复制一行那么他赋值不是数据而是地址
        //注：只能一行行的赋值
        for (int i = 0,k=3; i < nums.length; i++,k--) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]=nums_bak[k][j];
            }
        }
        //打印数据
        System.out.println("交换后");
        for (int[] x:nums){
            System.out.println(Arrays.toString(x));
        }
    }
}
