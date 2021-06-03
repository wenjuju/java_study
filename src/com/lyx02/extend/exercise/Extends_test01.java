package com.lyx02.extend.exercise;

public class Extends_test01 {
    public static void main(String[] args) {
        B b = new B();//分析执行过程和输出结果；
        /**
         * 1.调用无参构造B();执行this("abc")，无参构造1中有this所以没有super
         * 2.this("abc") 调用B类的有参构造B("abc")
         * 3.b（"abc"）有参构造中有一个默认的super方法，
         * 4.执行super()执行类型A的无参构造；输出a;
         * */
    }
}
class A{
    A(){
        System.out.println("a");//1.
    }
    A(String name){
        System.out.println("a name");
    }
}
class  B extends A{
    B(){
        this("abc");//
        System.out.println("b"); //3
    }
        B(String name){
            System.out.println("b name");// 2.
        }
}
