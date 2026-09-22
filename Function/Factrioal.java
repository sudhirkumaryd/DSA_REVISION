package Function;

import java.util.Scanner;

public class Factrioal {
    public static void Fact(int n)
    {
         int fac=1;
        for(int i=1;i<=n;i++)
       {
         fac=fac*i;
       }
       System.out.println("Factrioal of number n is ="+fac);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number  ");
        int n = sc.nextInt();
        Fact(n);
      
       
      
    }
}
