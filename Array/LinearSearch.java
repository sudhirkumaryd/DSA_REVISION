package Array;

import java.util.Scanner;

public class LinearSearch {

    public  static int linearSearch(int arr[],int target)
    {
           for(int i=0;i<arr.length;i++)
   {
              if(arr[i]==target)
                return i;
             
   }
   return -1;
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
    System.out.println("Enter elemet ypu want to search ");
    int target=sc.nextInt();
    int index=linearSearch(arr,target);
    if(index==-1)
        System.out.println("Target element "+target+" not in array");
    else
        System.out.println("Target element "+target+"  in array at index = "+index);


   
 sc.close();
    }
   
}


