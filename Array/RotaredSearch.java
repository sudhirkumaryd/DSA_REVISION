package Array;

import java.util.Scanner;

public class RotaredSearch {

    public static int search(int[] arr, int target) {

        int s = 0;
        int e = arr.length - 1;
        int n = e + 1;
        while (s < e) {
            int m = (s + e) / 2;
            if (arr[m] == target)
                return m;
            else if (arr[m] < target) {
                if (target <= arr[n - 1])
                    s = m + 1;
                else
                    e = m - 1;
            } else {
                if (target >= arr[0])
                    e = m - 1;
                else
                    s = m + 1;
            }
        }
        return -1;

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

        System.out.println("Enter elemet ypu want to search ");
        int target = sc.nextInt();
        int index = search(arr, target);
        if (index == -1)
            System.out.println("Target element " + target + " not in array");
        else
            System.out.println("Target element " + target + "  in array at index = " + index);
    }
}
