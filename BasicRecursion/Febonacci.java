package BasicRecursion;

public class Febonacci {
    public static void main(String[] args) {
        int result = fib(6);
        System.out.println(result);
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
