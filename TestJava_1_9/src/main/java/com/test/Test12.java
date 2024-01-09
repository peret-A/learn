package com.test;

public class Test12 {
    /*
    20：随机产生一个字符，判断：如果为大写字母则输出“大写字母”；如果为小写字母则输出“小写字母”；否则怎输出“其他字符”；
     */
    public static void main(String[] args) {
        //通过ascii发现最大值127
        char ch=(char)(Math.random()*128);
        if(ch>='a'&&ch<='z'){
            System.out.println("小写字母");
        }else if(ch>='A'&&ch<='Z'){
            System.out.println("大写字母");
        }else{
            System.out.println("其他字符");
        }
    }
}
