package Function;

import java.util.Scanner;

public class Product {
    public static void product(int a ,int b) {
        System.out.println("Product of two number ="+(a*b));
        
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number  ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        product(a, b);
        
    }
}
