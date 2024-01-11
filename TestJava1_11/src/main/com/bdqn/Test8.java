package bdqn;

import java.util.Arrays;
import java.util.Scanner;

public class Test8 {
    /*
    06：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        //定义n个数据的数组
        System.out.println("输入多少个数据");
        int size=scanner.nextInt();
        int[] nums=new int[size];
        System.out.println("输入整形数据");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scanner.nextInt();
        }
        System.out.println("后移多少个位置");
        int index=scanner.nextInt();
        System.out.println("后移" + index + "个位置后");
        System.out.println(Arrays.toString(nums));
        //思路将m到结束的数据复制一份，
        int[] num_bak= Arrays.copyOfRange(nums,nums.length-index,nums.length);
        //将前面的数据依次后移
        for (int i = 0; i < nums.length-index; i++) {
            nums[i+index]=nums[i];
        }
        //将复制的数据放到前
        for (int i = 0; i < index; i++) {
            nums[i]=num_bak[i];
        }
        System.out.println("后移" + index + "个位置后");
        System.out.println(Arrays.toString(nums));
    }
}
