package com.test;

public class Test5 {
    /*
    05：输出小写的a-z以及大写的在Z—A
     */
    public static void main(String[] args) {
        //循环初始化
      char  ch1='a';
      char  ch2='Z';
      do{
          System.out.print(ch1);
          ch1++;
      }while (ch1<='z');
        System.out.println();
      while (ch2>='A'){
          System.out.print(ch2);
          ch2--;
      }
    }
}
