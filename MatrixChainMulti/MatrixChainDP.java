package MatrixChainMulti;
import java.util.Scanner;

public class MatrixChainDP {

    public static void matrixChainOrder(int[] dims) {
        int n = dims.length - 1; 
        int[][] dp = new int[n + 1][n + 1]; 
        int[][] split = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i][i] = 0;
        }

        for (int len = 2; len <= n; len++) { 
            for (int i = 1; i <= n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + dims[i - 1] * dims[k] * dims[j];
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                        split[i][j] = k;
                    }
                }
            }
        }

        System.out.println("\nDP Table:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > j) System.out.print("   -\t");
                else System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSplit Table: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) System.out.print("   -\t");
                else System.out.print(split[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMinimum number of multiplications: " + dp[1][n]);
        System.out.print("Optimal parenthesization: ");
        // printOptimalOrder(split, 1, n);
        System.out.println();
    }

    // public static void printOptimalOrder(int[][] split, int i, int j) {
    //     if (i == j) {
    //         System.out.print("A" + i);
    //         return;
    //     }
    //     System.out.print("(");
    //     printOptimalOrder(split, i, split[i][j]);
    //     printOptimalOrder(split, split[i][j] + 1, j);
    //     System.out.print(")");
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of matrices: ");
        int n = sc.nextInt();

        int[] dims = new int[n + 1];
        System.out.println("Enter dimensions (row and column) of each matrix:");

        for (int i = 0; i < n; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (i == 0) dims[0] = row;
            dims[i + 1] = col;
        }

        matrixChainOrder(dims);
    }
}
