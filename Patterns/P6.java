package Patterns;

public class P6 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            int k = 1;
            for (int j = 0; j < 5; j++) {
                if (j >= i) {
                    System.out.print(k++ + " ");
                }
            }
            System.out.println();
        }

    }
}
