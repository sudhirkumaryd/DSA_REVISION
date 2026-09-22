package Function;

import java.util.Scanner;

public class CheckPalendrome {
    public  static boolean isPalendrome(int n)
    {


        int reverse=0;
        int a=n;
        while(a>0)
        {
            int rem=a%10;
            reverse=reverse*10+rem;
            a=a/10;

        }
        return reverse==n ? true :false;
    }
    public static void main(String[] args) {
        
    
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter   number :");
        int n = sc.nextInt();
        if(isPalendrome(n))
            System.out.println(n+" is Palendrome number ");
        else
             System.out.println(n+" is not an Palendrome number ");
        
    }
}
