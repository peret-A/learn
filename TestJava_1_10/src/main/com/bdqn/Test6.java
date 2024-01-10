package bdqn;

import java.util.Scanner;

public class Test6 {
    /*
    06：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
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
        System.out.print("输入后移多少个位置");

    }
}
