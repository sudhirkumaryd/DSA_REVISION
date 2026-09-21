package Basic;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);

    System.out.println("Enter one  number ");
    int a=sc.nextInt();
    System.out.println("Enter second  number ");
    int b=sc.nextInt();
    System.out.println("Enter third  number ");
    int c=sc.nextInt();
    
    float avg=(float)(a+b+c)/3;
    // if you divied two integer than give integer
    
    System.out.println("Average of three number :"+avg);

    
    }
}
