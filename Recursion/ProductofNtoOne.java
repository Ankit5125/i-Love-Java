package Recursion;

public class ProductofNtoOne {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(productOfN(num));
    }

    static int productOfN(int num) {
        if (num == 1) {
            return 1;
        }

        return num * productOfN(num - 1);
    }
}
