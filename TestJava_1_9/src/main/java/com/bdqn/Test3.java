package com.bdqn;

public class Test3 {
    public static void main(String[] args) {
        a:for(int i=0;i<10;i++){
            System.out.print(i);
            b:for(int j=0;j<10;j++){
                System.out.print(j);
                if(j==5){
                    break a;
                }
            }
            System.out.println();
        }
    }
}
