package Function;

import java.util.Scanner;

public class BinoryToDecimal {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter  binery number :");
        int n = sc.nextInt();
        int decimal=0;
        int t=0;
        while(n>0)
        {
            int i=n%10;
             if(i==1)
                decimal+=Math.pow(2, t);
            t++;
            n=n/10;
        }
        System.out.println("Decimal number is :"+decimal);
    }
    
}
