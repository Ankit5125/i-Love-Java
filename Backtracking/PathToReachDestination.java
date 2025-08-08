package Backtracking;

public class PathToReachDestination {
    public static void main(String[] args) {
        System.out.println(printPath(3,3, ""));
    }

    static String printPath(int cRow, int cCol, String cAns){
        if (cCol == 1){
            return cAns + "D".repeat(cRow-1) + "\n";
        }

        if (cRow == 1) { 
            return cAns + "R".repeat(cCol-1) + "\n";
        }

        String left = printPath(cRow-1, cCol, cAns + "D");
        String right = printPath(cRow, cCol-1, cAns + "R");
        
        return left.concat(right);
    }
}
