package com.test;

public class Test8 {
    /*
    24：山上有一口缸可以装50升水，现在有15升水。老和尚叫小和尚下山挑水，每次可以挑5升。
    问：小和尚要挑几次水才可以把水缸挑满？通过编程解决这个问题。
    提示：
    (1) 用整型变量water表示水缸里的水“int water = 15;”。
    (2) 用整型变量l表示小和尚下山挑水的次数“int l = 0;”。
    (3) 分析循环条件（水少于50升），循环操作（水增加5升，挑水次数增加1）。
    (4) 套用while循环（或do-while循环）写出代码。
     */
    public static void main(String[] args) {
        int water=15;
        int count=0;
        do {
            water+=5;
            count++;
        }while (water<=50);
        System.out.println("小和尚要挑" + count + "次水才可以把水缸挑满");
    }
}
