import java.util.Arrays;

public class ArraysTool {
    /**
     * 2、定义一个数组工具类，在类中定义如下方法：
     * 	1）定义一个静态方法，实现求int类型数组最大值
     * 	2）定义一个静态方法，实现求int类型数组最小值
     * 	3）定义一个静态方法，实现求int类型数组所有元素之和
     * 	4）定义一个静态方法，实现求int类型数组升序排序
     * 	5）定义一个静态方法，实现求int类型数组降序排序
     * 	6）定义一个静态方法，实现求int类型数组元素逆序输出
     * 	7）定义一个静态方法，实现查找指定int类型数组中是否包含指定值
     */
    //定义一个静态方法，实现求int类型数组最大值
    public static int arraysMax(int[] nums){
        //默认第一位是最大值
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            //如果有数字大于当前max就用max记录这个值
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    //定义一个静态方法，实现求int类型数组最小值
    public static int arraysMin(int[] nums){
        //默认第一位是最小值
        int min=nums[0];
        for (int i = 0; i < nums.length; i++) {
            //如果有数字小于当前min就用min记录这个值
            if(min>nums[i]){
                min=nums[i];
            }
        }
        return min;
    }

    //定义一个静态方法，实现求int类型数组所有元素之和
    public static int arraysSum(int[] nums){
        //创建sum统计元素之和
        int sum=0;
        for (int element:nums){
            sum+=element;
        }
        return sum;
    }

    //定义一个静态方法，实现求int类型数组升序排序
    public static void arraysSort(int[] nums){
        Arrays.sort(nums);
    }

    //定义一个静态方法，实现求int类型数组降序排序
    public static void arraysReSort(int[] nums){
        //冒泡排序
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    //数据交换
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }

    //定义一个静态方法，实现求int类型数组元素逆序输出
    public static void arraysRePrint(int[] nums){
        for (int i = nums.length-1; i >=0 ; i--) {
            System.out.print(nums[i]);
        }
    }

    //定义一个静态方法，实现查找指定int类型数组中是否包含指定值
    public static boolean arraysSearch(int[] nums,int num){
        for (int element:nums){
            if(element==num){
                return true;
            }
        }
        return false;
    }
}
