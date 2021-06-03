package com.constructor;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

public class Constructor_test01 {
    public static void main(String[] args) {
        /*1.每个类都有默认的构造方法
            构造方法与类名同名；
            构造方法可以加访问控制修饰符；
            构造方法没有返回值；是没有不是void;
            类都有默认的构造方法（没有参数的构造方法），当写了带参的构造方法后默认的就会失效；要重写不带参的构造方法；
         *
         *
        Cat cat1 = new Cat();
        Cat cat_hei = new Cat("xiaohei", 20);
        System.out.println("刚买的猫属性：名字："+cat_hei.name+"；年龄"+ cat_hei.age);
        cat_hei.name="小蓝";
        cat_hei.age=21;
        System.out.println("一年后猫属性：名字："+cat_hei.name+"；年龄"+ cat_hei.age);
         */
        // 利用无参构造初始化；
        Person p1 = new Person();
        System.out.println("name:"+p1.name+";age:"+p1.age);
        //有参构造传参初始化对象；
        Person p2 = new Person("小李", 20);
        System.out.println("name2:"+p2.name+";age:"+p2.age);
    }

}
class Cat{
    /**g构造方法完成对新对象的初始化；
     * */
    String name;
    int age;
    public Cat(){}
    public Cat(String pname,int page){
        System.out.println("构造器被调用，完成对象属性的初始化");
        name=pname;//将方法中的参数赋值属性全局变量；
        age=page;
    }
}
class Person{
    //定义无参构造
    int age;
    String name;
    //利用无参构造初始属性值；
    public Person(){
        name="狗子";
        age=18;

    }
    public Person(String name ,int age){
        this.name=name;
        this.age=age;
    }
}