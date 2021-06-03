package com.branch;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        /*
        * 成绩问题；成绩大于60，小于100为及格，小于60为不及格，不能大于100；
        * 要求：用switch完成；
        * 强转：（int）【0--60】/60 ==0  (int)(60----100)==1;
        * */
        double source = new Scanner(System.in).nextDouble();
        if (source>=0&&source<=100){
            switch ((int)source/60){
                case 1:
                    System.out.println("及格了");
                    break;
                case 0:
                    System.out.println("不及格");
                    break;
            }
        }
     else
            System.out.println("你的成绩不对");

        /*
         * 月份问题；3，4，5 /6，7，8/9，10，11/12，1，2，
         * 使用穿透实现；
         * case 3：
         * case 4:
         * case 5:sout ""; break
         * case 6:
         *
         *
         *
         * */

    }
}
