package Loops;

import java.util.Scanner;

public class PrintReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter   number ");
        int a = sc.nextInt();

        while (a > 0) {

            System.out.print(a % 10);
            a = a / 10;

        }

    }
}
