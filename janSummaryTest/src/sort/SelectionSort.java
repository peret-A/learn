package sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ints = {10,5,3,1,6,4,8,9,2,7};

        for (int i:ints){
            System.out.print(i+"  ");
        }
        System.out.println();
        //排序 升序
        for(int i=0;i<ints.length-1;i++){
            for(int j=i+1;j<ints.length;j++){
                if(ints[i]>ints[j]){
                    int cur = ints[i];
                    ints[i] = ints[j];
                    ints[j] = cur;
                }
            }
        }
        for (int i:ints){
            System.out.print(i+"  ");
        }
    }
}
