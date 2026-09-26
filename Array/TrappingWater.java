package Array;

import java.util.Scanner;

public class TrappingWater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int n = sc.nextInt();
        System.out.println("Enter elemets of array");
        int height[] = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = 0;
        rightMax[n - 1] = 0;
        for (int i = 1; i < n; i++) {
            leftMax[i] = (int) Math.max(height[i - 1], leftMax[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = (int) Math.max(height[i + 1], rightMax[i + 1]);
        }
        int water = 0;
        for (int i = 0; i < n; i++) {
            int min = (int) Math.min(leftMax[i], rightMax[i]);
            if (min > height[i])
                water += min - height[i];
        }
        System.out.println("Water :" + water);
        sc.close();

    }
}
