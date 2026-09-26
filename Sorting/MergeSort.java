package Sorting;

import java.util.Scanner;

public class MergeSort {

    public static void swap(int arr[], int i, int j) {

        arr[j] = arr[j] + arr[i];
        arr[i] = arr[j] - arr[i];
        arr[j] = arr[j] - arr[i];

    }

    public static void merge(int arr[], int s, int m, int e) {

        int temp[] = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int t = 0;
        while (i <= m && j <= e) {
            if (arr[i] <= arr[j])
                temp[t++] = arr[i++];
            else
                temp[t++] = arr[j++];

        }
        while (i <= m) {

            temp[t++] = arr[i++];

        }
        while (j <= e) {

            temp[t++] = arr[j++];

        }
        t = 0;
        for (int k = s; k <= e; k++) {
            arr[k] = temp[t++];
        }

    }

    public static void mergeSort(int arr[], int s, int e) {

        if (s < e) {
            int m = (s + e) / 2;
            mergeSort(arr, s, m);
            mergeSort(arr, m + 1, e);
            merge(arr, s, m, e);
        }
        return;

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
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted  elemets of arrays ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
