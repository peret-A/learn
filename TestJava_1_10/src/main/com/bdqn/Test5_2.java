package bdqn;

import java.util.Scanner;

public class Test5_2 {
    /*
   05：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
   注：错误点没有记录下标导致数字无法交换
   思路1：现在有max min 可以再经过一次循环取出对应的下标再依靠下标交换
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

        System.out.print("交换前 ");
        for (int  element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
        //最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
        //定义max 记录最大值，min记录最小值  且都假定是第一位 记录的方式是数字本身
        int max=nums[0];
        int min=nums[0];
        // 每个都要比较max min
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]< min){
                min=nums[i];
            }
        }
        //用于交换
        int  temp=0;
        temp=max;
        max=nums[0];
        nums[0]=temp;

        temp=min;
        min=nums[nums.length-1];
        nums[nums.length-1]=temp;


        System.out.print("交换后 ");
        for (int  element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
