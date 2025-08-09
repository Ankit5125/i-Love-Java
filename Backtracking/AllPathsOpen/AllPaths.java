package Backtracking.AllPathsOpen;

public class AllPaths {
    public static void main(String[] args) {

        int n = 3;
        Boolean[][] maze = new Boolean[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = true;
            }
        }

        printAllPaths(0,0, maze, "");
    }

    static void printAllPaths(int row, int col,Boolean[][] maze, String ans){
        int n = maze.length-1;
        if (row == n && col == n) {
            System.out.println(ans);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

        if (row < n) {
            printAllPaths(row+1, col,maze , ans + "D");
        }

        if (col < n) {
            printAllPaths(row, col+1, maze,ans + "R");
        }

        if (row > 0) {
            printAllPaths(row-1, col,maze, ans+"U");
        }
        if (col> 0) {
            printAllPaths(row, col-1, maze, ans+"L");
        }

        maze[row][col] = true;
    }
}
