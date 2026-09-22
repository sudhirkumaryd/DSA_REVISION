package Conditional;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter   salary ");
        float a = sc.nextFloat();

        if (a < 500000)
            System.out.println("Tax 0% for salary");
        else if (a >= 500000 && a < 1000000)
            System.out.println("Tax 20% for salary");
        else
            System.out.println("Tax 30% for salary");
    }
}
