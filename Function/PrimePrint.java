package Function;

import java.util.Scanner;

public class PrimePrint {
      public static boolean IsPrime(int n)
    {
        boolean temp=true;
        if(n==1)
            return false;
        for(int i=2;i*i<=n;i++)
       {

         if(n%i==0)
         {
            temp=false;
            break;
         }
       }
       return temp;
    }
   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  starting value :");
        int s = sc.nextInt();
         System.out.println("Enter  ending value :");
        int e = sc.nextInt();
       for(int i=s;i<=e;i++)
       {
        if(IsPrime(i))
            System.out.println(i);
       }
     }
}
