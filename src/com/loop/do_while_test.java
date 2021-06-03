package com.loop;

public class do_while_test {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        do {
            System.out.print(i);
            sum=i+sum;
            i++;
            System.out.println("   和:"+sum);

        }
        while (i<=10);
    }

}
