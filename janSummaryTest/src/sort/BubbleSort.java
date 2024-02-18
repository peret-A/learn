package sort;



public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {10,5,3,1,6,4,8,9,2,7};

        for (int i:ints){
            System.out.print(i+"  ");
        }
        System.out.println();
        //排序 升序
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length-i-1; j++) {
                if(ints[j]>ints[j+1]){
                    int cur = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = cur;
                }
            }
        }
        for (int i:ints){
            System.out.print(i+"  ");
        }
    }
}
