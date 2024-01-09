package com.test;

public class Test9 {
    /*
    23：输出100以内的所有素数，每行显示5个；并求和。
     */
    public static void main(String[] args) {
        int sum=0;
        //统计5个换行
        int count=0;
        //输出100以内
        for(int i=2;i<=100;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    if(i==j){
                        sum+=i;
                        count++;
                        System.out.print(i+" ");
                        if(count==5){
                            count=0;
                            System.out.println();
                         }
                    }else{
                        break;
                    }

                }
            }

        }
        System.out.println("和"+sum);
    }
}
