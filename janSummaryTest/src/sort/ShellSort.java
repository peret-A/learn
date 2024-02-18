package sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] ints = {10,5,3,1,6,4,8,9,2,7};

        for (int i:ints){
            System.out.print(i+"  ");
        }
        System.out.println();
        //排序 升序
        int gap = ints.length;
        //多次预排+最后一次直接插入排序
        while (gap > 1)
        {
            gap = gap / 3 + 1;//控制最后一次进来gap为1进行直接插入排序
            for (int i = 0; i < ints.length - gap; i++)
            {
                int end = i;
                //记录 以防被覆盖
                int tmp = ints[end + gap];
                while (end >= 0)
                {
                    if (tmp < ints[end])
                    {
                        ints[end + gap] = ints[end];
                        end -= gap;
                    }
                }
                ints[end + gap] = tmp;
            }
            for (int i:ints){
                System.out.print(i+"  ");
            }
            System.out.println();
        }

    }
}
