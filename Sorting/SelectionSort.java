package Sorting;

import java.util.Scanner;

public class SelectionSort {

    public static void swap(int arr[], int i, int j) {

        arr[j] = arr[j] + arr[i];
        arr[i] = arr[j] - arr[i];
        arr[j] = arr[j] - arr[i];

    }

    public static void selectionSort(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != i)
                swap(arr, index, i);
        }

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
        System.out.println("Unsorted  elemets of arrays ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        selectionSort(arr);
        System.out.println("\nSorted  elemets of arrays ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
