package Patterns;

public class P13 {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        int k = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
