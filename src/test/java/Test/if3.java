package Test;

import java.util.Scanner;

public class if3 {
    public static void main(String[] args) {
        int price=1000;
        Scanner scan= new Scanner(System.in);
        String Sex;
        int Age,High;
        System.out.println("性别(man/woman)：");
        Sex=scan.next();
        System.out.println("年龄：");
        Age=scan.nextInt();
        System.out.println("身高：");
        High=scan.nextInt();
        if(Sex.equals("man"))
            if(Age>20&&Age<26&&High>170)
                System.out.println("符合入伍条件");
            else
                System.out.println("不符合入伍条件");
        else if(Sex.equals("woman"))
            if(Age>20&&Age<22&&High>162)
                System.out.println("符合入伍条件");
            else
                System.out.println("不符合入伍条件");
    }
}
