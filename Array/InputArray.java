package Array;
import java.util.Scanner;
public class InputArray {
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
   for(int i=0;i<n;i++)
   {
            System.out.print(arr[i]);
   }

    }
}
