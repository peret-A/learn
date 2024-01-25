package bdqn.test03;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        //创建Scanner对象
        Scanner scanner =new Scanner(System.in);
        //输入target
        int target = scanner.nextInt();
        //自定义数组
        int[] nums ={1,2,3,4,5,6,7,8,9,10,12,16,18,30};
        int start = 0;
        int end =nums.length-1;
        System.out.println(search(nums, start, end, target));
    }
    //  1 2 3 5 7 10 11 15
    //  8

    public static int search(int[] nums,int start,int end,int target){

        //如果start>end
        if(start>end)
            return -1;
        //即中间值小于要查找的值
        if(nums[(start+end)/2]<target){
            return search(nums,(start+end)/2+1,end,target );
        }else if(nums[(start+end)/2]>target){
            //即中间值大于target
            return search(nums,start,(start+end)/2-1,target );
        }else {
            return (start + end) / 2;
        }
    }
}
