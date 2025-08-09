package Backtracking.AllPathsOpen;

public class AllPaths {
    public static void main(String[] args) {
        printAllPaths(1,1,"");
    }

    static void printAllPaths(int row, int col, String ans){
        if (row == 3 && col == 3) {
            System.out.println(ans);
            return;
        }

        if (row < 2) {
            printAllPaths(row+1, col, ans + "D");
        }

        if (col < 2) {
            printAllPaths(row, col+1, ans + "R");
        }

        if (row > 0) {
            printAllPaths(row-1, col, ans+"U");
        }
        if (col> 0) {
            printAllPaths(row, col-1, ans+"L");
        }
    }
}
