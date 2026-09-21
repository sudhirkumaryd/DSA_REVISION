package Basic;

import java.util.Scanner;

public class Bill {
     public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);

    System.out.println("Enter pencile  price  ");
    float a=sc.nextFloat();
    System.out.println("Enter pen price ");
    float b=sc.nextFloat();
    System.out.println("Enter eraser  price ");
    float c=sc.nextFloat();
    
    float sum=a+b+c;
    // if you divied two integer than give integer
    float billWithGst=sum+(sum*18)/100;
    
    System.out.println("Toatal Bill of three item :"+billWithGst);

    
    }
    
}
