package com.lyx;

public class Tset_this {
    public static void main(String[] args) {
        Dog dog1 = new Dog("xy", 23);
        dog1.info();
    }
}
class Dog{
    String name;
    int age;
    public Dog(){}
    public Dog(String name1,int age){
        // name=name 分析一下这个玩意；前面name为变量明，根据就近原则为方法中的参数；后面那个name为参数；
        //this，java会给每个对象分配this，代表当前对象，
        this.name=name;//this.name=当前对象，this.name=对象的name=对象的属性;当前对象的属性；
        this.age=age;
    }
    public  void  info(){//成员方法；输出信息；
        System.out.println("name:"+name+";age:"+age);

    }
}