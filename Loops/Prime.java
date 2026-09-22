package Loops;
import java.util.Scanner;

public class Prime {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter   number");
        int a = sc.nextInt();
        boolean temp = true;
       for(int i=2;i<=a/2;i++)
       {
        if(a%i==0)
        {
            temp=false;
            break;
        }
       }
       if(temp)
        System.out.println(a+" is a Prime number");
    else
         System.out.println(a+" is not a Prime number");
    }
}
