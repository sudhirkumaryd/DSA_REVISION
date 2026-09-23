package Pattern;

import java.util.Scanner;

public class T4 {
     public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n=sc.nextInt();
        int t=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {   
                System.out.print((t)+" ");
                t++;
            }
            

            System.out.println();
        }
        sc.close();
    }
}
