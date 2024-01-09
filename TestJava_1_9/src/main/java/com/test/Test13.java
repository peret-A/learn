package com.test;

public class Test13 {
    /*
    19：随机产生一个字母，如果是大写字母则输出“yes”，否则输出“no”
     */
    public static void main(String[] args) {
        //通过ascii发现最大值127
        char ch=(char)(Math.random()*128);
       if(ch>='A'&&ch<='Z'){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
