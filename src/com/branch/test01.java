package com.branch;

import java.util.Scanner;

public class test01 {
    //if 的单分支，多分枝，就不看了，switch；
    /**   switch (){case 变量:   break; default;break;}
     *     细节1：switch 类型和case类型一致，或者能转换；
     *        2. switch（）byte,short,int,char,string,枚举；6种类型的；
    **/
    //字符练习；
    public static void main(String[] args) {
        char c1=new Scanner(System.in).next().charAt(0);//获取字符
        switch (c1){
            case 'a' :
                System.out.println("星期一");
                break;

            case 'b' :
                System.out.println("星期二");
                break;
            case 'c' :
                System.out.println("星期三");
                break;
            case 'd' :
                System.out.println("星期四");
                break;
            case 'e' :
                System.out.println("星期五");
                break;
            case 'f' :
                System.out.println("星期六");
                break;
            case 'g' :
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入的啥，滚吧");
        }
    }

}
