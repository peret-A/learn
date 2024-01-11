package bdqn;

import java.util.Scanner;

public class Test1 {
    /*
    13：有10个数字要求分别用选择法和冒泡法从大到小输出
    选择排序：
    选择排序（ Selection sort）是一种简单直观的排序算法。
    它的工作原理是每一趟从待排序的数据元素中选出最小（或最大）的一个元素，顺序放在已排好序的数列的最后，直到全部待排序的数据元素排完。
    冒泡排序：
     冒泡排序算法的原理如下：
    比较相邻的两个元素，如果前者比后者大（反之倒序），则交换。
    对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。
    针对所有的元素重复以上的步骤。
    持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        //定义长度为十的数组
        int[] nums=new int[10];

        //输入数据
        System.out.println("输入十个数据");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scanner.nextInt();
        }

        //选择排序 选择第一个为最小
        int min=0;
        System.out.println("选择排序");
        System.out.println("排序前");
        for (int element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
        // 倒数第二个排完，最后一个就不用排了
        for (int i = 0; i < nums.length-1; i++) {
            min=i;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            //确定最小元素的下标再进行交换
            int temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        System.out.println("排序后");
        for (int element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("输入十个数据");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scanner.nextInt();
        }
        System.out.println(" 冒泡排序");
        System.out.println("排序前");
        for (int element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
        // 一趟冒泡可以将最大值移动到最右边
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                //要保证右边的值大于左边
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println("排序后");
        for (int element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
