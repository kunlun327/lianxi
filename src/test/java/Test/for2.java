package Test;

public class for2 {
    public static void main(String[] args) {
        int n=5;int j=1;
        int m=65;
        for(int i=0;i<n;i++)
        {
          for(int l=4;l>i;l--){
              System.out.print(" ");
          }
           for(int k=0;k<j;k++)
           {
               System.out.print((char)m);
           }
            System.out.println();
           j=j+2;

           m=m+1;
        }

    }

}
