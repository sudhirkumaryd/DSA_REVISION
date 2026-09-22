package Function;

import java.util.Scanner;

public class Average {
    public  static  void average(int a,int b,int c)
    {
        int sum=a+b+c;
        System.out.println("average of three number :"+sum/3.0f);
    }
    
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter  three  number :");
        int a= sc.nextInt();
         int b= sc.nextInt();
          int c= sc.nextInt();
          average(a,b,c);
    }
}
