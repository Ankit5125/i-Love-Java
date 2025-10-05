package MakingChange;

import java.util.Arrays;
import java.util.Scanner;

public class MakingChangeUsingDP {

    static int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        // Fill array with a very large number initially
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0; // Base case: 0 coins needed for amount 0

       for (int i = 1; i <= amount; i++) {
    for (int coin : coins) {
        if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
            dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
        }
    }
    System.out.println("After computing amount " + i + ": " + Arrays.toString(dp));
}

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of coin types: ");
        int n = sc.nextInt();
        int[] coins = new int[n];

        System.out.println("Enter coin denominations: ");
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.println("Enter amount: ");
        int amount = sc.nextInt();

        int result = minCoins(coins, amount);
        if (result == -1)
            System.out.println("Not possible to make change.");
        else
            System.out.println("Minimum coins required: " + result);

        sc.close();
    }

}

// package MakingChange;

// import java.util.Scanner;

// public class MakingChangeUsingDP {

//     static int minCoins(int[] coins, int amount) {
//         int[] dp = new int[amount + 1];

//         // Fill array with a very large number initially
//         for (int i = 1; i <= amount; i++) {
//             dp[i] = Integer.MAX_VALUE;
//         }
//         dp[0] = 0; // Base case: 0 coins needed for amount 0

//         // Header row
//         System.out.print("Amt : ");
//         for (int i = 0; i <= amount; i++) {
//             System.out.printf("%4d", i);
//         }
//         System.out.println();

//         // DP iteration
//         for (int i = 1; i <= amount; i++) { 
//             for (int coin : coins) {
//                 if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
//                     dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
//                 }
//             }

//             // Print DP state after computing dp[i]
//             System.out.printf("dp[%d]: ", i);
//             for (int j = 0; j <= amount; j++) {
//                 if (dp[j] == Integer.MAX_VALUE)
//                     System.out.printf("%4s", "∞");
//                 else
//                     System.out.printf("%4d", dp[j]);
//             }
//             System.out.println();
//         }

//         return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of coin types: ");
//         int n = sc.nextInt();
//         int[] coins = new int[n];

//         System.out.println("Enter coin denominations: ");
//         for (int i = 0; i < n; i++) {
//             coins[i] = sc.nextInt();
//         }

//         System.out.println("Enter amount: ");
//         int amount = sc.nextInt();

//         int result = minCoins(coins, amount);
//         if (result == -1)
//             System.out.println("Not possible to make change.");
//         else
//             System.out.println("Minimum coins required: " + result);

//         sc.close();
//     }
// }
