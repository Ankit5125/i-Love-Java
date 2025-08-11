package Backtracking.NQueens;

public class NQueens {
    public static void main(String[] args) {

        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(printNQueens(board, 0));
    }
    

    static int printNQueens(boolean[][] board, int row) {
        if (row == board.length) {
            displayBoard(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for(int col = 0; col < board.length ; col++){
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += printNQueens(board, row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // vertical row
        for (int i = 0; i < board.length; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // for left diag
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if (board[row-i][col-i]) {
                return false;
            }
        }

        // for right diag
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    public static void displayBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean els : row) {
                if (els) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
