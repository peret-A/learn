package sort;

public class HeapSort {
    public static void main(String[] args) {
        int[] ints = {10,5,3,1,6,4,8,9,2,7};

        for (int i:ints){
            System.out.print(i+"  ");
        }
        System.out.println();
        //排序 升序
        heapSort(ints,ints.length);
        for (int i:ints){
            System.out.print(i+"  ");
        }
    }

    public static void heapSort(int[] ints,int size) {
        //建堆
        for(int i=size/2-1;i>=0;i--){
            heapify(ints,size,i);
        }
        //排序
        //因为大顶堆第一个元素是最大的所以就其放最后一位再维护
        //将最后一位元素与第一交换
        for (int i=0;i<size;i++){
            int tem = ints[0];
            ints[0] = ints[size-i-1];
            ints[size-i-1] = tem;
            heapify(ints,size-i-1,0);
        }
    }

    public static void heapify(int[] ints, int size, int i) {
        int parent = i;
        int lson = i*2+1;
        int rson = i*2+2;
        //保证不越界
        if(lson<size&&ints[parent]<ints[lson])
            parent =lson;
        if(rson<size&&ints[parent]<ints[rson])
            parent =rson;
        if(parent!=i){
            //说明孩子比父亲小所以交换
            int tem = ints[parent];
            ints[parent] = ints[i];
            ints[i] = tem;
            heapify(ints,size,parent);
        }
    }


}
