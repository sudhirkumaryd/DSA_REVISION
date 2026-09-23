package Pattern;

import java.util.Scanner;

public class HolloRectangle {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter height :");
        int h=sc.nextInt();
         System.out.println("Enter length :");
        int l=sc.nextInt();
        for(int i=1;i<=h;i++)
        {
            for(int j=1;j<=l;j++)
            {
                if(i==1 || i==h || j==1 || j==l)
                System.out.print("* ");
                else
                System.out.print("  ");

            }
            System.out.println();
        }
        sc.close();
    }
}
