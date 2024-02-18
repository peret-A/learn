package sort;

public class BucketSort {
    public static void main(String[] args) {
        int[] ints = {10,5,3,1,6,4,8,9,2,7};

        for (int i:ints){
            System.out.print(i+"  ");
        }
        System.out.println();
        //排序 升序
        bucketSort(ints);
        for (int i:ints){
            System.out.print(i+"  ");
        }
    }

    public static void bucketSort(int[] ints) {
        //获取待排序数组的最大值
        int maxValue = getMaxValue(ints);
        //初始化桶数组
        int[] bucketArray = new int[maxValue + 1];
        //将待排序数组元素放入桶数组中
        for (int i = 0; i < ints.length; i++) {
            bucketArray[ints[i]]++;
        }
        //遍历桶数组，将桶中元素放入待排序数组
        int index = 0;
        for (int i = 0; i < bucketArray.length; i++) {
            for (int j = 0; j < bucketArray[i]; j++) {
                ints[index++] = i;
            }
        }
    }

    public static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
