package Array;

import java.util.Scanner;

public class LargestSmallElemet {
   

    public  static int large(int arr[])
    {

        int max=Integer.MIN_VALUE;
           for(int i=0;i<arr.length;i++)
         {
              if(arr[i]>max)
                max=arr[i];
             
          }
       return max;
    }
     public  static int small(int arr[])
    {
        int min=Integer.MAX_VALUE;
           for(int i=0;i<arr.length;i++)
   {
              if(arr[i]<min)
                min=arr[i];
             
   }
   return min;
    }
   
   
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
   
   
        System.out.println("Largest element is "+large(arr));
        System.out.println("Small element is "+small(arr));


   
 sc.close();
    }
   
}



    
