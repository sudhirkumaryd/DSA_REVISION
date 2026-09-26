package Array;

import java.util.*;
import java.util.Scanner;

public class Dublicat {

    public static boolean dublicate(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                return true;
        }
        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");
        int n = sc.nextInt();

        System.out.println("Enter elemets of array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        System.out.println("At least one element dublicat in arrays  :" + dublicate(arr));
    }
}
