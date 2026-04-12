package Patterns;

public class P18 {
    public static void main(String[] args) {
        
        print(5);

    }

    static void print(int n){

        for (int i = 0; i < n; i++) {
            char k = (char) ('A' + n - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }

    }
}
