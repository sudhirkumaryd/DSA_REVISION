package Loops;

import java.util.Scanner;

public class Factorial {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number  ");
        int n = sc.nextInt();
       int fac=1;
       for(int i=1;i<=n;i++)
       {
         fac=fac*i;
       }
       System.out.println("Factrioal of number n is ="+fac);
      
    }
}
