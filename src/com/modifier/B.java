package com.modifier;

public class B {
    public  void say(){
        A a = new A();
        //在同包下，可以访问public，protected和，默认，不能访问private
        System.out.println(a.n1+a.n2+a.n3);
    }
}
