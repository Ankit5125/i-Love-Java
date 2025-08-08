package Backtracking.ObstaclesInPath;

public class Obstacles {
    public static void main(String[] args) {
        printPathWithoutObstacle(1,1, "", 2, 2);
    }

    static void printPathWithoutObstacle(int row, int col, String ans, int oRow, int oCol){
        if (row == 3 && col == 3) {
            System.out.println(ans);
            return;
        }

        if (row == oRow && col == oCol) {
            return;
        }

        if (row < 3) {
            // go to down
            printPathWithoutObstacle(row+1, col, ans+ "D", oRow, oCol);
        }
        if (col < 3) {
            // go to right
            printPathWithoutObstacle(row, col+1, ans+"R", oRow, oCol);
        }

    }
}
