package com.bdqn;

import java.util.Scanner;

public class Test9 {
    /*
    * 老师每天检查张浩的学习任务是否合格，如果不合格，
    * 则继续进行。老师给张浩安排的每天的学习任务为：
    * 上午阅读教材，学习理论部分，下午上机编程，掌握代码部分
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String answer;
        do{
            System.out.println("上午阅读教材，学习理论部分，下午上机编程，掌握代码部分");
            answer=scanner.next();
        }while(answer.equals("不合格"));
    }
}
