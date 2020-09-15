package Test;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        int num=(int)(Math.random()*100);
        for(int i=1;i<7;i++)
        {
            System.out.println(num);
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();
            if(num>n)
                System.out.println("太小了，再大一点！");
            else
                if(num<n)
                    System.out.println("太大了，再小一点！");
                else
                    if(num==n)
                        System.out.println("恭喜你猜对了！");
        }
        System.out.println("你太笨了，下次再来吧！");


        }

    }


