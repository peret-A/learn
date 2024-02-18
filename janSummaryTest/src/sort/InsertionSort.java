package sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] ints = {10,5,3,1,6,4,8,9,2,7};

        for (int i:ints){
            System.out.print(i+"  ");
        }
        System.out.println();
        //排序 升序
        for(int i=1;i<ints.length;i++){
            int cur = ints[i];
            int j;
            for(j=i;j>0;j--){
                if(ints[j-1]>cur){
                    ints[j] = ints[j-1];
                }else{
                    break;
                }
            }
            ints[j]=cur;
        }
        for (int i:ints){
            System.out.print(i+"  ");
        }
    }
}
