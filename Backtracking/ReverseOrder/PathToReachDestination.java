package Backtracking.ReverseOrder;

public class PathToReachDestination {
    public static void main(String[] args) {
        System.out.println(printPath(3,3, ""));
        // methodTwo(3, 3, "");
    }

    static void methodTwo(int cRow, int cCol, String ans){
        if (cRow == 1 && cCol == 1) {
            System.out.println(ans);
        }

        if (cRow>1) {
            methodTwo(cRow-1, cCol, ans + 'D');
        }
        if (cCol > 1) {
            methodTwo(cRow, cCol-1, ans + 'R');
        }
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
