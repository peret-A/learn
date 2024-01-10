package bdqn;

import java.util.Scanner;

public class Test5 {
    /*
    05：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
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
        //定义max 记录最大值，min记录最小值  且都假定是第一位 记录的方式是下标
        int max=0;
        int min=0;
        // 每个都要比较max min
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]>nums[max]){
               max=i;
           }
           if(nums[i]< nums[min]){
               min=i;
           }
        }
        //用于交换
        int  temp=0;
        //最大值不是第一位就交换
        if(min!=0){
            temp=nums[max];
            nums[max]=nums[0];
            nums[0]=temp;
        }
        //最小值不是最后一位就交换
        if(max!=nums.length){

            temp=nums[min];
            nums[min]=nums[nums.length-1];
            nums[nums.length-1]=temp;
        }

        System.out.print("交换后 ");
        for (int  element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
