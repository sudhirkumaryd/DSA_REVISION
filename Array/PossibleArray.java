package Array;

import java.util.Scanner;

public class PossibleArray {
    
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

       
        for(int j=i;j<n;j++)
        {
              
            String st="(";
            for(int k=i;k<=j;k++)
            {
                st+=arr[k];
            }
            st+=")";
            System.out.print(st);



        }
            
            System.out.println();
     }


   
 sc.close();
    }
   





    



}
