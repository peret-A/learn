import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
//        int[][] nums={{1},{2,3}, {4}};
//        for (var x:nums){
//            System.out.println(Arrays.toString(x));
//        }
//        nums[0][0]=5;
//        for (var x:nums){
//            System.out.println(Arrays.toString(x));
//        }

//        int[] nums={3,5,7,9,2,1};
//        System.out.println(Arrays.toString(nums));
//            Arrays.fill(nums,1,4,8);
//        System.out.println(Arrays.toString(nums));

//        int[] nums={3,5,7,9,2,1};
//        int[] nums_bak=Arrays.copyOf(nums,3);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(nums_bak));


//        int[] nums={3,5,7,9,2,1};
//        int[] nums_bak=Arrays.copyOfRange(nums,2,5);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(nums_bak));

        int[] nums={3,5,7,9,2,1};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums,2,5,5));
    }
}
