package com.lyx02.extend;

public class sub extends Base {
    public sub(){
        System.out.println("sub()构造方法");
    }
    public void sayOk(){
        System.out.println(n1+n2+n3+getN4());
        test100();
        test200();
        test300();
        //test400();得在父类写一个公共方法返回；
    }

}
