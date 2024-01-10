package bdqn;

import java.util.Scanner;

public class Test1 {
    /*
    01：对10个整数进行按照从小到大的顺序排序
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        //创建数组长度为10
        int[] nums=new int[10];
        //输入10个整数
        for(int i=0;i<10;i++){
            nums[i]=scanner.nextInt();
        }
        System.out.print("排序前： ");
        for (int element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
        //循环嵌套 每个一次外循环将最小的数字放在第一位
        for (int i=0;i<nums.length;i++){
            for (int j = i; j < nums.length; j++) {
                //每次都假定第一位是最小值 如果第一位大于后置位就交换
                if(nums[i]>nums[j]){
                    nums[i]+=nums[j];
                    nums[j]=nums[i]-nums[j];
                    nums[i]-=nums[j];
                }
            }
        }
        System.out.print("排序后： ");
        for (int element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
