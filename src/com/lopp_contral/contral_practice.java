package com.lopp_contral;

public class contral_practice {
    public static void main(String[] args) {
        double money = 100000;
        double hl = 0.05;
        int sum=0;
        while (money > 50000) {
           money=money*hl;
           sum++;
        }

    }
}