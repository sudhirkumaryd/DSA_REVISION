package Array;

import java.util.Scanner;

public class TringleArray {
    

 public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.print("Enter size of array :");
    int n=sc.nextInt();
    
          System.out.println("Enter elemets of array");
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
             arr[i]=sc.nextInt();
   }
    System.out.println("Pairs elemets of arrays ");
      for(int i=0;i<n;i++)
     {

        for(int j=i+1;j<n;j++)
             System.out.print("("+arr[i]+","+arr[j]+")");
            System.out.println();
     }


   
 sc.close();
    }
   
}




    


