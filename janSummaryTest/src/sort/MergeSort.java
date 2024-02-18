package sort;

public class MergeSort {
    public static void main(String[] args) {
        int[] ints = {10,5,3,1,6,4,8,9,2,7};

        for (int i:ints){
            System.out.print(i+"  ");
        }
        System.out.println();
        //排序 升序
        //作为数组的中转站
        int[] arr = new int[ints.length];
        mergeSort(ints,arr,0,ints.length-1);
        for (int i:ints){
            System.out.print(i+"  ");
        }
    }

    public static void mergeSort(int[] ints,int[] arr,int left,int right) {
        //如果left<right说明还不是单个元素继续划分
        if(left<right){
            int mid = (left+right)/2;
            //左半区划分
            mergeSort(ints,arr,left,mid);
            //右半区划分
            mergeSort(ints,arr,mid+1,right);
            //合并
            merge(ints,arr,left,mid,right);
        }
    }
    public static void merge(int[] ints,int[] arr,int left,int mid,int right){
        //这样返回可以通过mid来确定上次分组的情况
        int l_pos =left;
        int r_pos =mid+1;
        int pos =left;
        while (l_pos<=mid&&r_pos<=right){
            if(ints[l_pos]<ints[r_pos]){
                //如果左边小就将左边的元素放到临时数组arr中
                arr[pos++] = ints[l_pos++];
            }else {
                //如果右边小就将左边的元素放到临时数组arr中
                arr[pos++] = ints[r_pos++];
            }
        }
        //将左边剩余元素全部放到arr中
        while (l_pos<=mid){
            arr[pos++] = ints[l_pos++];
        }
        //将右边剩余元素全部放到arr中
        while (r_pos<=right){
            arr[pos++] = ints[r_pos++];
        }
        //将临时数组的元素替换进ints中
        while (left<=right){
            ints[left]=arr[left];
            left++;
        }
    }
}
