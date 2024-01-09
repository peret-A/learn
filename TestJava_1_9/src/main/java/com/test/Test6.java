package com.test;

public class Test6 {
    /*
    26：开发一个标题为“FlipFlop”的游戏应用程序。它从1计数到100，
    遇到3的倍数就替换为单词“Flip”，5的倍数就替换为单词“Flop”，既为3的倍数又为5的倍数则替换为单词“FlipFlop”。
     */
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if(i%3==0&&i%5==0){
                System.out.print("\tFlipFlop");
            }else if(i%3==0){
                System.out.print("\tFlip");
            }else if(i%5==0){
                System.out.print("\tFlop");
            }else{
                System.out.print("\t"+i);
            }
        }
    }
}
