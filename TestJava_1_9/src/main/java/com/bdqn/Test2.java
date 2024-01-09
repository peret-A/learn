package com.bdqn;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("学生姓名");
        String name=scanner.next();
        System.out.println("输入成绩1");
        int score1,score2,score3,score4,score5;
       while (true){
          score1=scanner.nextInt();
           if(score1>=0){
               break;
           }else{
               System.out.println("分数错误重新输入");
           }
       }
        System.out.println("输入成绩2");
        while (true){
            score2=scanner.nextInt();
            if(score2>=0){
                break;
            }else{
                System.out.println("分数错误重新输入");
            }
        }
        System.out.println("输入成绩3");
        while (true){
            score3=scanner.nextInt();
            if(score3>=0){
                break;
            }else{
                System.out.println("分数错误重新输入");
            }
        }
        System.out.println("输入成绩4");
        while (true){
            score4=scanner.nextInt();
            if(score4>=0){
                break;
            }else{
                System.out.println("分数错误重新输入");
            }
        }
        System.out.println("输入成绩5");
        while (true){
            score5=scanner.nextInt();
            if(score5>=0){
                break;
            }else{
                System.out.println("分数错误重新输入");
            }
        }
        System.out.println("平均值" + (score1 + score2 + score3 + score4 + score5) / 5.0 + "分");
    }
}
