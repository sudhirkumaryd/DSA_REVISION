package Loops;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter   number ");
        int a = sc.nextInt();
        boolean temp = true;
        if (a < 0) {

            a = a * (-1);
            temp = false;
        }

        int num = 0;
        while (a > 0) {

            int r = a % 10;
            num = num * 10 + r;
            a = a / 10;

        }
        if (!temp)
            System.out.print(num * (-1));
        else
            System.out.print(num);
    }
}
