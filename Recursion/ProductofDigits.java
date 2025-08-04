package Recursion;

public class ProductofDigits {
    public static void main(String[] args) {
        int num = 2340;
        System.out.println(printProduct(num));
    }
    static int printProduct(int num){
        if (num < 10) {
            return num;
        }
        return num % 10 * printProduct(num/10);
    }
}
