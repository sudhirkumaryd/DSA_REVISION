package Function;

import java.util.Scanner;

public class Bionomial {
     public static int fact(int n)
    {
         int fac=1;
        for(int i=1;i<=n;i++)
       {
         fac=fac*i;
       }
       return fac;
    }
    public static void bionomial(int n,int r)
    {
       float ans=(float)fact(n)/(fact(r)*fact(n-r));
       System.out.println("Bionomail cofficaient ="+ans);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  value of n :");
        int n = sc.nextInt();
         System.out.println("Enter  value of r :");
        int r = sc.nextInt();
        bionomial(n,r);
       
      
       
      
    }
}
