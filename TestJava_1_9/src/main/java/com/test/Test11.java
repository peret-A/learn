package com.test;

public class Test11 {
    /*
    21：求100到1000之间的所有能被5和6整除的整数，每行显示5个
     */
    public static void main(String[] args) {
        //统计换行
            int count=0;
        for (int i=100;i<=1000;i++){
            if(i%5==0&&i%6==0){
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
