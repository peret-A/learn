package sort;

public class RadixSort {
    public static void main(String[] args) {
        int[] ints = {10,5,3,1,6,4,8,9,2,7};

        for (int i:ints){
            System.out.print(i+"  ");
        }
        System.out.println();
        //排序 升序
        radixSort(ints);
        for (int i:ints){
            System.out.print(i+"  ");
        }
    }
    public static void radixSort(int[] arr){
        //得到数组中最大的数的位数
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        int maxLength = (max + "").length();

        //用于临时存储数据的数组
        int[][] temp = new int[10][arr.length];
        //用于记录在temp中相应的数组中存放的数字的数量
        int[] counts = new int[10];

        //根据最大长度的数决定排序的趟数
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            //把每一个数字分别解析出来
            for (int j = 0; j < arr.length; j++) {
                int ys = arr[j] / n % 10;
                //把解析出来的数放入指定的temp数组中
                temp[ys][counts[ys]] = arr[j];
                //记录数量
                counts[ys]++;
            }
            //记录取的元素需要放的位置
            int index = 0;
            //把取出的元素放入原数组
            for (int k = 0; k < counts.length; k++) {
                //这里的counts[k]是当前的第k个桶中存放的数据个数
                if (counts[k] != 0){
                    for (int l = 0; l < counts[k]; l++) {
                        //取出元素
                        arr[index++] = temp[k][l];
                    }
                }
                //把每个数组计数器置零
                counts[k] = 0;
            }
        }
    }
}
