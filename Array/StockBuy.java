package Array;

import java.util.Scanner;

public class StockBuy {
    public static int maxProfit(int[] prices) {

        int n = prices.length;
        int maxRight[] = new int[n];
        maxRight[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--)
            maxRight[i] = Math.max(prices[i + 1], maxRight[i + 1]);

        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxRight[i] - prices[i], maxProfit);
        }
        return maxProfit;

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

        System.out.println("Maximum profit :" + maxProfit(arr));
    }
}
