import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] nums=new int[]{99,85,82,63,60};
        for (var element:nums){
            System.out.print(element + " ");
        }
        System.out.println();
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入要插入的数据");
        int num_inse=scanner.nextInt();
        int[] nums_new=new int[nums.length+1];
//        方式1
        //注意j<nums.length&&nums[j]>=num_inse 中j<nums.length要写在前面因为&&是左边为false就不判断右边就避免了越界访问
        for (int i = 0,j=0; i < nums_new.length; i++) {
            if(j<nums.length&&nums[j]>=num_inse  ){
                nums_new[i]=nums[j];
                j++;
            }else{
                nums_new[i]=num_inse;
                num_inse=nums[nums.length-1];
            }
        }

//
//        //方式2
//        //先复制
//        for (int i = 0; i < nums.length; i++) {
//            nums_new[i]=nums[i];
//        }
//        //原本数组的最后一位nums.length-1
//        for (int i = nums.length-1; i >=0; i--) {
//            if(nums[i]>num_inse){
//                nums_new[i+1]=num_inse;
//               break;
//            }else if(nums[i]<num_inse){
//                nums_new[i+1]=nums[i];
//            }
//        }
        for (var element:nums_new){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
