import java.util.Scanner;

public class Test2 {
    /*
    取最小值
     */
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner scanner=new Scanner(System.in);
        int[] nums=new int[4];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("第" + (i+1) + "店的手机价格为");
            nums[i]=scanner.nextInt();
            System.out.println();
        }
        //价格遍历
        System.out.println("手机价格分别为");
        for (var element:nums){
            System.out.print(element+" ");
        }
        System.out.println();
        //取最小值 记录的是下标
        int min=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        System.out.println("第" + (min+1) + "店的手机价格最低为" + nums[min]);
    }
}
