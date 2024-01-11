import java.util.Arrays;

public class Test4 {
    /*
    冒泡排序
     */
    public static void main(String[] args) {
        int[] nums=new int[]{54,32,6,515,3,246,455,21};
        System.out.println("排序前");
        for(var x:nums){
            System.out.print(x+" ");
        }
        System.out.println();
//        //nums.length-1;  减一是为了 第二个数字固定了第一个就不用比较了 少了一次循环
//        for (int i = 0; i < nums.length-1; i++) {
//            //nums.length-1-i  -i是为了 每次都将最大值放到最后，每次循环后就可以少比较一个
//            //减一是为了nums[j]>nums[j+1] 避免 j到最后一位越界访问。
//            for (int j = 0; j < nums.length-1-i; j++) {
//                if(nums[j]>nums[j+1]){
//                    int temp=nums[j];
//                    nums[j]=nums[j+1];
//                    nums[j+1]=temp;
//                }
//            }
//        }

//        Arrays.sort(nums);
//        Arrays.sort(nums,3,7);
//        int[] num2=new int[]{1,2,3,4};
//        System.out.println(Arrays.equals(nums, num2));

        String str=Arrays.toString(nums);
        System.out.println(str);
        String str1="hello";
        System.out.println(str1);
        System.out.println(nums.getClass().getSimpleName());
        System.out.println(str.getClass().getSimpleName());
//        System.out.println("排序后");
//        for(var x:nums){
//            System.out.print(x+" ");
//        }
//        System.out.println();
    }
}
