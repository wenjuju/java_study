package com.varScope;

public class Scope_test01 {
    public static void main(String[] args) {
        //1.全局变量可以不赋值，有默认值，成员变量不行，没有默认值，会报错；
        //2.成员变量名可以与全局变量名一致；访问时遵循就近原则；
        //同一作用域中变量名不能同名
        Person person = new Person();
        person.cc();
    }
}
class Person{
    String name="limou";
    public void cc(){
        String name="lidadiao";
        System.out.println("name:"+name);
    }
    public void  hi(){
        String address="湖南";
        //String address="上海"; 同一作用域中变量名不能同名
    }
}