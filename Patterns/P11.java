package Patterns;

public class P11 {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for (int i = 0; i < n; i++) {
            int k = (i + 1) % 2 ;
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(k == 0 ? k++ : k--);
                }
            }
            System.out.println();
        }
    }
}
