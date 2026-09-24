package Array;
import java.util.Scanner;
public class SubArraySum {

    // Iterative method
    public  static void  maxSum1(int arr[])
    {
       int max=Integer.MIN_VALUE;
       int n=arr.length;
      for(int i=0;i<n;i++)
     {

       int sum=0;
        for(int j=i;j<n;j++)
        {
             sum+=arr[j];
             if(sum>max)
                max=sum; 
        }
            
           
     }
     System.out.println("Maximum subarray sum "+max);
     
    }
     // prefix array method
    public  static void  maxSum2(int arr[])
    {
        int n=arr.length;
        int preFix[]=new int[n+1];
        preFix[0]=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
             sum+=arr[i];
             preFix[i+1]=sum;
        }
       int max=Integer.MIN_VALUE;  
      for(int i=0;i<n;i++)
     {
        for(int j=i;j<n;j++)
        {
            int s=preFix[j+1]-preFix[i];
            if(s>max)
                max=s;
        }       
     }
     System.out.println("Maximum subarray sum "+max);
     }
       // kerins alogrith method
    public  static void  maxSum3(int arr[])
    {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            
            
             sum+=arr[i];
             if(sum>max)
                max=sum;
             if(sum<0)
            {
                sum=0;
            }
        }
      
     System.out.println("Maximum subarray sum "+max);
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
    
    maxSum1(arr);
    maxSum2(arr);
    maxSum3(arr);
 
   
 sc.close();
    }
   





    



}


