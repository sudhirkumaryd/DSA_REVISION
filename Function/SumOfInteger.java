package Function;

import java.util.Scanner;

public class SumOfInteger {
     public static void main(String[] args) {
        
    
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter   number :");
        int a = sc.nextInt();
        int sum=0;
        while(a>0)
        {
            int rem=a%10;
           sum+=rem;
            a=a/10;

        }
             System.out.println(" sum of integer :"+sum);
        
    }
}
