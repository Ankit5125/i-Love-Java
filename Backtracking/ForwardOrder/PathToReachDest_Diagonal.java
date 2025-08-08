package Backtracking.ForwardOrder;

public class PathToReachDest_Diagonal {
    public static void main(String[] args) {
        
        // note i have thinked as row -> 1 2 3 not 0 1 2
        printPath(1,1,"");

    }

    static void printPath(int row, int col, String ans){
        if (row == 3 && col == 3) {
            System.out.println(ans);
            return;
        }

        if (row <3 && col < 3) {
            // go diagonal
            printPath(row+1, col+1, ans+"\tDiag");
        }
        if (row < 3) {
            // go to down
            printPath(row+1, col, ans + "\tD");
        }
        if (col < 3) {            
            // go to right
            printPath(row, col + 1, ans + "\tR");
        }
    }
}
