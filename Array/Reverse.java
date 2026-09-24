package Array;
import java.util.*;;

public class Reverse {

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
    System.out.println("Reverse elemets of arrays ");

    int s=0;
    int e=n-1;
    while(s<e)
    {
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
    }
      for(int i=0;i<n;i++)
   {
             System.out.print(arr[i]);
   }


   
 sc.close();
    }
   
}




    

