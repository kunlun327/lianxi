package Test;

import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double a=0,b=0;
        String c="";
        System.out.println("请输入第一个数：");
        a=scan.nextDouble();
        System.out.println("请输入第二个数：");
        b=scan.nextDouble();
        System.out.println("请输入运算符号：");
        c=scan.next();
        if(c.equals("+"))
            System.out.println(a+"+"+b+"="+(a+b));
        else if(c.equals("-"))
            System.out.println(a+"-"+b+"="+(a-b));
        else if(c.equals("*"))
            System.out.println(a+"*"+b+"="+(a*b));
        else if(c.equals("/"))
            System.out.println(a+"/"+b+"="+(a/b));
        else
            System.out.println("请输入正确的运算符");
    }
}

