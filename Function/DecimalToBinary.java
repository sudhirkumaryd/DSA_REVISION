package Function;

import java.util.Scanner;

public class DecimalToBinary {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter  Decimal number :");
        int n = sc.nextInt();
        int binary=0;
        //7
       // 2 1
        //2 1
        //1
        
    
        int t=0;
        while(n>0)
        {
            int rem=n%2;
             n=n/2;
             if(rem==1)
               binary=rem*(int)Math.pow(10, t)+binary;
            t++;
           
           
        }
        System.out.println("Decimal number is :"+ binary );
    }
}

