package Backtracking;

public class PathToReachDest_Diagonal {
    public static void main(String[] args) {

        // this time we can also go to diagonal
        printPath(3, 3, "");

    }

    static void printPath(int row, int col, String ans) {
        if (row == 1 && col == 1) {
            System.out.println(ans);
            return;
        }

        if (row > 1 && col > 1) {
            // goDiagonal
            printPath(row - 1, col - 1, ans + "\tDiag ");
        }
        if (row > 1) {
            // goDown
            printPath(row - 1, col, ans + "\tD");
        }
        if (col > 1) {
            // goRight
            printPath(row, col - 1, ans + "\tR");
        }
    }
}


// output
        // Diag    Diag 
        // Diag    D       R
        // Diag    R       D
        // D       Diag    R
        // D       D       R       R
        // D       R       Diag
        // D       R       D       R
        // D       R       R       D
        // R       Diag    D
        // R       D       Diag
        // R       D       D       R
        // R       D       R       D
        // R       R       D       D