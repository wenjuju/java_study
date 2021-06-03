package com.Encapsulation;

public class Encapsulation {
    //年龄：18-60，工资不能直接查看，name长度在2-6字符；
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("lyxdadioda");
        p1.setAge(23);
        p1.setSalary(100000.0);
        System.out.println(p1.info());
    }
}
class Person{
    public String name;
    private Double salary; //私有化
    private int age;
    //创建get（），set()s方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验；
        if (name.length()>=2&&name.length()<=6){
        this.name = name;}
        else {
            System.out.println("你输入的名字不对");
            this.name="无名";
        }
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>18&&age<60){
            this.age = age;
        }
        else {
            System.out.println("年龄不满足，需要在18-60之间");
            this.age = 0;//给一个默认年龄
        }
    }
    public String info(){
        return "name:"+name+"age"+age+"salary"+salary;
    }
}