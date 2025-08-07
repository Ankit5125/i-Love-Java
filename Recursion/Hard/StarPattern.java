package Recursion.Hard;

public class StarPattern {
    public static void main(String[] args) {

        int n = 5;
        // print_DownPattern(n, 0);
        // o/p: // *****
                // ****
                // ***
                // **
                // *


        print_DownPattern(n, 0);
        print_UpPattern(n, 0);
        // op:  // *****
                // ****
                // ***
                // **
                // *
                // *
                // **
                // ***
                // ****
                // *****

    }

    static void print_DownPattern(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("*");
            print_DownPattern(r, ++c);
        } else {
            System.out.println();
            print_DownPattern(r - 1, 0);
        }
    }

    static void print_UpPattern(int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            print_UpPattern(r, ++c);
            System.out.print("*");
        } else {
            print_UpPattern(r - 1, 0);
            System.out.println();
        }
    }

}
