package com.loop;

import java.util.Scanner;

public class do_while_test03 {
    //还钱问题；
    public static void main(String[] args) {
        /*
        * 问，还不还，不还打，继续问；y/n表示是/否；
        * */
        do {
            System.out.println("再问你一遍；还不还钱");
            char answer = new Scanner(System.in).next().charAt(0);
                System.out.println("早还钱不就好了");
                System.out.println("打死你");

        }
        while (true);
    }
}
