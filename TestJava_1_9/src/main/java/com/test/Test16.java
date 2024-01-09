package com.test;

public class Test16 {
    /*
    16：输出1-100之间的不能被5整除的数，每5个一行。
     */
    public static void main(String[] args) {
        //计算
        int count= 0;
        for (int i = 1; i <=100 ; i++) {
            if(i%5!=0){
                System.out.print("\t" + i);
                count++;
                if(count==5){
                    count=0;
                    System.out.println();
                }
            }
        }
    }
}
