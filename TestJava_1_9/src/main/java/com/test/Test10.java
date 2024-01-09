package com.test;

public class Test10 {
    /*
    22：求和：1/3+3/5+5/7+7/9+………..+97/99
     */
    public static void main(String[] args) {
        double sum=0;
        for(int i=1;i<97;i+=2){
            sum=sum+(i/(i+2.0));
        }
        System.out.println("和为" + sum);
    }
}
