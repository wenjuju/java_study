package com.lyx;

import sun.font.DelegatingShape;

import java.util.Scanner;

public class Recursion01 {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        T t = new T();
        t.test(n);
        System.out.println(n+"阶层的值是"+t.factorial(n));
        System.out.println(n+"的斐波那契数是："+t.fb(n));
        System.out.println("第"+n+"天，猴子还剩"+t.houzi(n)+"桃子");
    }
}
class  T{
    public  void test(int n){
        if (n>2){
            test(n-1);
        }
        System.out.println("n="+n);
    }
    /*阶层玩法
    * main  fa(5)=fa(4)*5=1*2*3*4*5
    * fa(4)=fa(3)*4=1*2*3*4
    * fa(3)=fa(2)*3=1*2*3
    * fa(2)=fa(1)*2 =1*2
    * fa(1)=1
    * */
    public  int factorial(int n){
            if (n==1) {
                return 1;
            }
            else {
                //方法在被执行的时候，会创造一个一个受保护的空间（栈空间），方法的局部变量是独立的；
              return   factorial(n-1)*n;
            }
            }
            /*
            * 斐波拉期数
            * 1，1，2，3，5，8,13
            * n=1 1
            * n=2 1
            * n=3 2
            * n=4 3
            * n=5  5
            * fb(4)=fb(3)+fb(2)=fb(2)+fb(1)+fb(2)
            * */
            public int fb(int n){
                if (n==1||n==2)
                    return 1;
                else
                    return fb(n-1)+fb(n-2);

            }
            /*
            * 猴子吃桃；
            * 每次吃一半+1个，吃到第10天剩1个；
            * f(10)=1;
            * f(9)=f(10)*2+1
            * f(8)=f(9)*2+1
            * f(n)=f(n+1)*2+1
            * */
            public  int houzi(int n){
                if (n==10) {
                    return 1;
                }
                else if (n>=1||n<=9){
                    return  houzi(n+1)*2+1;
                }

                return -1;
            }
    }

