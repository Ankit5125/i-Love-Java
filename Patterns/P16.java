package Patterns;

public class P16 {
    public static void main(String[] args) {
        
        print(5);

    }

    static void print(int n){
        for (char i = 'A'; i < 'A' + n; i++) {
            for (int j = 0; j < n; j++) {
                if(j <= i - 'A'){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
