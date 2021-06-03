package com.loop;

public class for_test02 {
    public static void main(String[] args) {
        /*
        * 99乘法表；
        * 第一层循环控制数量，
        * */
        for (int i= 1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"×"+i+"="+i*j+"\t");
            }
            System.out.println();
        }

    }
}
