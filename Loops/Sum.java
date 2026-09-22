package Loops;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter   number ");
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++)
            sum += i;
        System.out.println("sum of first n number :" + sum);
    }
}
