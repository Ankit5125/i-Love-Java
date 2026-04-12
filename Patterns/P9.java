package Patterns;

public class P9 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){

        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= 2*i ; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i - 1 >= j) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < 2*n - 2*i - 1; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
