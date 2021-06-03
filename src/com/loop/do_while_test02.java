package com.loop;

public class do_while_test02 {
    //统计 1-200中能被5除不能被3除的数，do  while实现
    public static void main(String[] args) {
        int i=1;
        int n=200;
        int t1=3;
        int t2=5;
        int sum=0;
        do {
            if (i%t2==0&&i%t1!=0){
                sum++;
                System.out.println(i);
            }
            i++;
        }
        while (i<=n);
        System.out.println("sum"+sum);
    }
}
