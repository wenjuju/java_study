package com.lyx02.extend;

public class Extends02 {
    //CTRL+H
    public static void main(String[] args) {
        /**
         * 继承的细节；
         * super()必须写在第一行；（super只能写在构造器中；）
         * 创建对象的时候，父类的无参构造方法会先被调用；再执行子类的构造方法；
         * 当父类的无参构造方法不存在时，，必须在子类的所以构造方法中用super指定父类构造方法；
         * 显示调用父类的构造方法（）super;this（）也是？所以两个不能存在一个构造器；
         * object是所以类的父类；
         * 父类构造方法的调用不限于直接父类，将一直往上追溯到object类（顶级父类）
         * 子类最多只能继承一个父类（直接继承）单继承；
         * 继承不能滥用，满足 is a的关系；
         * */
        sub sub = new sub();//子类在创建的时候会先调用父类的构造方法

    }
}
