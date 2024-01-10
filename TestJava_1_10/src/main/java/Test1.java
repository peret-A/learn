public class Test1 {
    public static <type> void main(String[] args) {
//        int[] a=new int[5];
//        System.out.println(a[0]);
//        for (int i = 0; i < a.length; i++) {
//            a[i]=i;
//            System.out.println(a[i]);
//        }
//
//        for (int x:a){
//            System.out.println(x);
//        }
//
//        String[] strs={"hello","world","fan"};
//        String[] strss=new String[]{"hello","world","fan"};
//        System.out.println(strss[0]);
//        for (String x:strs){
//            System.out.println(x);
//        }
//        for (String x:strss){
//            System.out.println(x);
//        }
//
//        double[] nums={12.54,123.1,20.2};
//        for (double x:nums){
//            System.out.println(x);
//        }
////      var 是java10以后推出的 等价于auto
//        for(var element: nums)
//        {
//            System.out.println(element);
//        }
//
//        for (var element:strss){
//            System.out.println(element);
//        }
//        for (var element:strs){
//            System.out.println(element);
//        }
//
////
//        //说明一个长度为5的数组
//        int[] nums=new int[5];
//
//        //使用范围for遍历
//        for (int x:nums){
//            System.out.print(x+" ");
//        }
//
//        //通过输入的方式存储数据
//        //创建Scanner对象
//        Scanner scanner=new Scanner(System.in);
//        for(int i=0;i<nums.length;i++){
//            nums[i]=scanner.nextInt();
//        }
//        //使用范围for遍历
//        for (int x:nums){
//            System.out.print(x+" ");
//        }
//        int[] nums2=new int[5];
//        for (int x:nums2){
//            x=scanner.nextInt();
//            System.out.println(x);
//        }
//        //使用范围for遍历
//        for (int x:nums2){
//            System.out.print(x+" ");
//        }


//        double[] score={98.5,96,99.5,89.5,100};
//        double sum=0;
//        for(double x:score){
//            sum+=x;
//        }
//        System.out.println(sum/score.length);
//
//        int[] nums = {8, 4, 2, 1, 23, 344, 12};
//        //遍历
//        for (int x : nums) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//        //求和
//        int sum = 0;
//        for (int x : nums) {
//            sum += x;
//        }
//        //猜数字
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入数字");
//        int guess = scanner.nextInt();
//        //默认没有猜中了
//        boolean flag = true;
//        for (int x : nums) {
//            if (guess == x) {
//                System.out.println("猜的数字在此列");
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag) {
//            System.out.println("没有猜中");
//        }
//        //假定第一个为最大值
//        int max=nums[0];
//        for(int x:nums){
//            //如果数据大于假定的最大值max，就将该数据假定为最大值
//            if(x>max){
//                max=x;
//            }
//            //如果不大于就继续
//        }
//        System.out.println(max);
//        for (int x:nums){
//            System.out.println(x);
//        }
        int[] nums = {344, 23,12,8, 4, 2, 1};
        int[] nums_new=new int[8];
        int num_inse=20;
//        nums_new[0]=20;
//        for (int i = 1; i <nums_new.length ; i++) {
//            nums_new[i]=nums[i-1];
//        }
        //因为nums已经有序直接比较大小先插入较大的数据
        for (int i = 0, j=0; i < nums_new.length; i++) {
            //如果nums[j]>num_inse 说明nums当前值较大插入nums的值,如果不是插入num_inse
            if(nums[j]>=num_inse){
                nums_new[i]=nums[j];
                j++;

            }else{
                nums_new[i]=num_inse;
                //且将num_inse变成最小的数，避免nums的后续数据无法插入
                num_inse=nums[nums.length-1];
            }
        }
        //遍历
        for (int x : nums_new) {
            System.out.print(x + " ");
        }
    }
}

