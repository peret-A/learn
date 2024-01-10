package bdqn;

import java.util.Scanner;

public class Test4 {
    /*
    04：将一个数组逆序输出。
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入数组长度");
        int size=scanner.nextInt();
        //定义数组
        int[] nums=new int[size];
        //输入数据
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scanner.nextInt();
        }
        System.out.print("逆序输出");
        for (int i = nums.length-1; i >=0 ; i--) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
