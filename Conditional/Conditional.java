package Conditional;

import java.util.Scanner;

public class Conditional {
    
    public static void main(String[] args) {
        
           
         Scanner sc=new Scanner(System.in);

    System.out.println("Enter one  number ");
    int a=sc.nextInt();
    System.out.println("Enter second  number ");
    int b=sc.nextInt();
   
    if(a>b)
        System.out.println("a>b:"+a);
    else
         System.out.println("a<b:"+b);

    
    }
    }

