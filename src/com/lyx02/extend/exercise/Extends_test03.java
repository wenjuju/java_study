package com.lyx02.extend.exercise;

public class Extends_test03 {
    /**案例3；   编写Computer类，包含CPU，内存，硬盘等属性，get方法返回computer信息；
                编写PC类，继承computer类，添加特有属性brand；
                创建pc对象分别给对象中特有属性brand和继承的computer中的属性傅志，并使用方法打印出来；
       **/
    public static void main(String[] args) {
        PC lianx = new PC("联想", "1cpu", "16G", "256T");
        lianx.printInfo();
    }
}
class  Computer{
    private  String cpu;
    private  String memory;
    private  String yp;//disk
   public Computer(String cpu,String memory,String yp){
       this.cpu=cpu;
       this.memory=memory;
       this.yp=yp;
   }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getYp() {
        return yp;
    }

    public void setYp(String yp) {
        this.yp = yp;
    }

    public String getDetails(){
        return " cpu="+cpu+" memory= "+memory+" yp="+yp;
    }
}
class  PC extends Computer{
    private String brand;
    public PC(String brand,String cpu, String memory, String yp) {
        super(cpu, memory, yp);
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void  printInfo(){
        System.out.println(getDetails()+" brand="+brand);
    }
}


class NotePad extends Computer{
    private String color;
    public NotePad(String cpu, String memory, String yp,String color) {
        super(cpu, memory, yp);
        this.color=color;
    }
}
