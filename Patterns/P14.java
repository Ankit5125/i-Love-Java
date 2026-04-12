package Patterns;

public class P14 {
    public static void main(String[] args) {

        print(5);

    }

    static void print(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
