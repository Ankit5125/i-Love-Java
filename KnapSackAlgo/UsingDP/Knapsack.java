package KnapSackAlgo.UsingDP;

import java.util.Arrays;
import java.util.Scanner;

public class Knapsack {
    static int knapsack(int W, int[] val, int[] wt) {
        int[] dp = new int[W + 1];

        for (int i = 0; i < wt.length; i++) {
            for (int j = wt[i]; j <= W; j++) {
                dp[j] = Math.max(dp[j], dp[j - wt[i]] + val[i]);
                System.out.println(Arrays.toString(dp));
            }
        }
        return dp[W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter (N) : ");
        int n = sc.nextInt();

        int[] val = new int[n];
        int[] wt = new int[n];

        System.out.println("Enter Values for " + n + " Items : ");
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        System.out.println("Enter Weights for " + n + " Items : ");
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }

        System.out.print("Enter Max Weight : ");
        int W = sc.nextInt();

        System.out.println(knapsack(W, val, wt));
        
        sc.close();
    }
}