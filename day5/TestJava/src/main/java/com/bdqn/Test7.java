package com.bdqn;

public class Test7 {
    /*

    四叶草数 各位的数字的四次方之和等于他本身
     */
    public static void main(String[] args) {
        int i=1000;
        while (i<10000){
            if(Math.pow(i%10,4)+
                    Math.pow(i/10%10,4)+
                    Math.pow(i/100%10,4)+
                    Math.pow(i/1000,4)==i){
                System.out.println("四叶草数 = " + i);
            }
            i++;
        }
    }
}
