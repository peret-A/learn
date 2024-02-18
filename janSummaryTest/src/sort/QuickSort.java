package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] ints = {10,5,3,1,6,4,8,9,2,7};

        for (int i:ints){
            System.out.print(i+"  ");
        }
        System.out.println();
        //排序 升序
        quickSort(ints,0,ints.length-1);
        for (int i:ints){
            System.out.print(i+"  ");
        }
    }

    public static void quickSort(int[] ints, int low, int high) {
        if(low<high){
            int mid = quick(ints,low,high);
            quickSort(ints,low,mid-1);
            quickSort(ints,mid+1,high);
        }
    }

    public static int quick(int[] ints, int low, int high) {
        //每次都取最右边为基准
        int pos = ints[high];
        //cur是当前扫描到的元素
        //tem是记录到的元素
        //作用是如果cur扫描的元素小于pos就将元素交换
        int cur = low;
        int tem = low;
        for(;cur<high;cur++){
            if(ints[cur]<pos){
                int k = ints[cur];
                ints[cur] = ints[tem];
                ints[tem] = k;
                tem++;
            }
        }
        int k =  ints[high];
        ints[high] = ints[tem];
        ints[tem] = k;
        return tem;
    }
}
