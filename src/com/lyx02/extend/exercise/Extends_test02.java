
package com.lyx02.extend.exercise;

public class Extends_test02 {
    public static void main(String[] args) {
        C1 c1 = new C1();
        /*1.调用c的无参构造；this("hello")
        * 2.调用c的有参构造；super("hahaha")
        * 3.再调用B1的有参构造；
        * 4。B的有参构造中有super()
        * 5.调用A的无参构造；输出A类
        *
        * */
    }
}
class A1{
    public A1(){
        System.out.println("我是A类");//1.
    }
}
class B1 extends A1{
    public B1(){
        System.out.println("我是B1类的无参构造方法");
    }
    public  B1(String name){
        System.out.println(name+"我是B1类的有参构造方法");//2
    }
        }
class  C1 extends  B1{
    public  C1(){
        this("hello");
        System.out.println("我是C1类的无参构造方法");//4
    }
    public C1(String name){
        super("hahaah");
        System.out.println("我是C1的有参构造方法");//3.
    }
}
