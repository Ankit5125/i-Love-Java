package Backtracking.ReverseOrder;

public class StepToReachDestination {
    public static void main(String[] args) {
        System.out.println(countSteps(12,12));
    }

    static int countSteps(int row, int col){
        if (row == 1 || col == 1) {
            return 1;
        }

        int left = countSteps(row-1, col);
        int right = countSteps(row, col-1);
        return left + right;
    }
}

/*
 * (3,3) => 
 * _______________
 * |____|____|___|
 * |____|____|___|
 * |____|____|___|
 *  
 * rrdd, rdrd, ddrr, drdr, drrd, rddr
 * 
 */
