package TwoDArray;

import java.util.Scanner;

public class SprialMatrix {
    public static void sprial(int arr[][]) {
        int r = arr.length;
        int c = arr[0].length;

        int n = r % 2 == 0 ? r / 2 : r / 2 + 1;
        for (int i = 0; i < r / 2; i++) {

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        int r = sc.nextInt();
        System.out.println("Enter column :");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter of elemet in 2d Array ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("2 D ARRAY");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sprial(arr);
        sc.close();
    }
}
