package com.loop;

public class for_test01 {
    public static void main(String[] args) {
        /*打印1~~100中9的倍数，并统计数量*/
        int sum=0;
        int i=1;
        int end=100;
        int t=5;
        for (;i<=end;){
            if (i%t==0){
                sum++;
                System.out.println("第"+sum+"个"+t+"的倍数的值为："+i);
            }
            i++;
        }
        System.out.println("一共有多少个9的倍数"+sum);
    }
}
