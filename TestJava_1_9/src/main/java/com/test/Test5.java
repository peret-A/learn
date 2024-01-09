package com.test;

import java.util.Scanner;

public class Test5 {
    /*
    27：生成13位条形码
    Ean-13码规则：第十三位数字是前十二位数字经过计算得到的校验码。
    例如：690123456789
    计算其校验码的过程为：
    @前十二位的奇数位和6+0+2+4+6+8=26
    @前十二位的偶数位和9+1+3+5+7+9=34
    @将奇数和与偶数和的三倍相加26+34*3=128
    @取结果的个位数：128的个位数为8
    @用10减去这个个位数10-8=2
    所以校验码为2
    （注：如果取结果的个位数为0，那么校验码不是为10（10-0=10），而是0）
    实现方法ean13（）计算验证码，输入12位条码，返回带验证码的条码。
    例：输入：692223361219输出：6922233612192
     */
    public static void main(String[] args) {
           //创建Scanner对象
            Scanner scanner=new Scanner(System.in);
           System.out.println("输入12位数字");
           long num1=scanner.nextLong();
             //num2备份
            long num2=num1;
            // 奇数
            long odd=0;
            // 偶数
            long even=0;
            //取出奇偶数
            while (num1!=0){
                //偶数
                if(num1%2==0){
                    even=even+num1%10;
                    num1/=10;
                }else{
                    odd=odd+num1%10;
                    num1/=10;
                }
            }
            num2=num2*10+(odd+even* 3L)%10;
            num1=num2;
        System.out.println("校验码为："+num1);
    }
}
