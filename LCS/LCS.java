package LCS;

public class LCS {
    public static int lcs(String X, String Y) {
        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];

        // Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Print the DP table
        System.out.println("DP Table:");
        System.out.print("    "); // Top-left empty space
        for (int j = 0; j < n; j++) {
            System.out.print(Y.charAt(j) + " ");
        }
        System.out.println();

        for (int i = 0; i <= m; i++) {
            if (i == 0)
                System.out.print(" "); // First row label
            else
                System.out.print(X.charAt(i - 1));
            
            System.out.print(" ");
            
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String X = "ABCBDAB";
        String Y = "BDCAB";
        int length = lcs(X, Y);
        System.out.println("\nLength of LCS is: " + length);
    }
}
