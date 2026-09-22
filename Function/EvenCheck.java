package Function;

import java.util.Scanner;

public class EvenCheck {
    public  static boolean isEven(int n)
    {
        return n%2==0 ? true : false;
    }
    public static void main(String[] args) {
        
    
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter   number :");
        int n = sc.nextInt();
        if(isEven(n))
            System.out.println(n+" is an even number ");
        else
             System.out.println(n+" is not an even number ");
        
    }
}
