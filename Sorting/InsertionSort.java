package Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void swap(int arr[], int i, int j) {

        arr[j] = arr[j] + arr[i];
        arr[i] = arr[j] - arr[i];
        arr[j] = arr[j] - arr[i];

    }

    public static void bubbleSort(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int j = i;
            int insert = arr[i + 1];
            while (j >= 0 && insert < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = insert;

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
        bubbleSort(arr);
        System.out.println("\nSorted  elemets of arrays ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
