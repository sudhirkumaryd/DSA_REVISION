package Loops;

import java.util.Scanner;

public class EvenOddSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number ");
        int n = sc.nextInt();
        int even=0;
        int odd=0;
        
       for(int i=0;i<n;i++)
       {
        int a=sc.nextInt();
        if(a%2==0)
       {
        even+=a;
       }else
       {
        odd+=a;
       }
      
    }

    System.out.println("sum of even number :"+even);
     System.out.println("odd of even number :"+odd);
}
}
