package bdqn;

import java.util.Scanner;

public class Test3 {
    /*
    03：有一个已经按升序排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
    <提示>程序分析：首先判断此数第一次小于数组中哪个元素，然后将此数插入，插入后此元素之后的数，依次后移一个位置。
     */
    public static void main(String[] args) {
        //注：数组的长度是无法改变的
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
        //排升序
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
        //传入数据
        System.out.println("输入要插入的数据");
        int num_inse=scanner.nextInt();
        System.out.print("插入数据前 ");
        for (int element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
        //数组长度不可变 创建新的数组
        int[] nums_new=new int[size+1];
        //因为nums_new是升序的，所以只需要找到最近大于num_inse的位置插入就可以了
        for (int i = 0,j=0; i < nums_new.length; i++) {
            if(nums[j]<num_inse){
                nums_new[i]=nums[j];
                j++;
            }else{
                //插入结束要将num_inse变成nums中最大的，避免nums的后续数字无法插入
                nums_new[i]=num_inse;
                num_inse=nums[nums.length-1];

            }
        }
        System.out.print("插入数据后 ");
        for (int element:nums_new){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
