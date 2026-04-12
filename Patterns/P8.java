package Patterns;

public class P8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i - 1 >= j) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 10 - 2*i - 1; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
