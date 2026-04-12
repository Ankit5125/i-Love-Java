package Patterns;

public class P17 {
    public static void main(String[] args) {
        
        print(4);

    }

    static void print(int n){

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i - 1 ; j++) {
                System.out.print(" ");
            }
            
            char k = 'A';
            for (char j = 0; j < 2*i + 1;j++) {
                if (j < i) {
                    System.out.print(k++);
                }
                else{
                    System.out.print(k--);
                }
            }
            System.out.println();
        }

    }
}
