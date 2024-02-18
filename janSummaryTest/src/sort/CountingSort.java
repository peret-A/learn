package sort;

public class CountingSort {
    public static void main(String[] args) {
        int[] ints = {10,5,3,1,6,4,8,9,2,7};

        for (int i:ints){
            System.out.print(i+"  ");
        }
        System.out.println();
        //排序 升序
        countingSort(ints);

        for (int i:ints){
            System.out.print(i+"  ");
        }
    }

    public static void countingSort(int[] ints) {
        //找到最大的元素
        int max =ints[0];
        for (int i=0;i<ints.length;i++){
            if(max<ints[i])
                max = ints[i];
        }
        int[] count =new int[max+1];
        int[] outArray = new int[max+1];
        for (int i=0;i<ints.length;i++){
            count[ints[i]]++;
        }
        for (int i=1;i<max+1;i++){
            count[i]+=count[i-1];
        }
        for (int i=0;i<ints.length;i++){
            outArray[count[ints[i]]-1]=ints[i];
            count[ints[i]]--;
        }
        for (int i=0;i<ints.length;i++){
            ints[i]= outArray[i];
        }
    }
}
