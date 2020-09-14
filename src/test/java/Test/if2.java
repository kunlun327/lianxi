package Test;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        int price=1000;
        Scanner scan= new Scanner(System.in);
        int Month,Day;
        System.out.println("请输入出行月份：");
        Month=scan.nextInt();
        System.out.println("请输入出行日：");
        Day=scan.nextInt();
        if(Month<1||Month>12||Day<1||Day>31)
            System.out.println("输入错误！");
        else if(Month==1&&Day>=1&&Day<=3)
            System.out.println("无优惠，票价为"+price+"元");
        else if(Month==5&&Day>=1&&Day<=3)
            System.out.println("无优惠，票价为"+price+"元");
        else if(Month==5&&Day>=1&&Day<=3)
            System.out.println("无优惠，票价为"+price+"元");
        else
            System.out.println("有优惠，票价为"+(0.8*price)+"元");
    }

}
