package Loops;

import java.util.Scanner;

public class PrintTillMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter   number except multiple of 10");
        int a = sc.nextInt();
        boolean temp = true;
        while (a % 10 != 0) {

            System.out.println(a);
            a = sc.nextInt();

        }
    }
}
