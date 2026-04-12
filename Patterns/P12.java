package Patterns;

public class P12 {
    public static void main(String[] args) {

        print(4);

    }

    static void print(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }

            for (int j = 0; j < 2*n - 2*i -2; j++) {
                System.out.print(" ");
            }

            for (int j = i +1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
