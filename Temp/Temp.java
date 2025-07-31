public class Temp {
    public static void main(String[] args) {
        
        // long start = System.nanoTime();
        // System.out.println(febo(50));
        // long end = System.nanoTime();
// System.out.println("Recursion : " + (end - start));

        long start2 = System.nanoTime();
        System.out.println(feboIteration(50));
        long end2 = System.nanoTime();

    }

    static int iterativePower(int a, int b) {
        for (int i = 0; i < b; i++) {
            a *= 2;
        }
        return a;
    
    }

    static long feboIteration(int n){
        long a1 = 0;
        long a2 = 1;
        long a3 = a1+a2;
        while (a3 < n) {
            a1 = a2;
            a2 = a3;
            a3 = a1 + a2;
        }
        return a3;
    }

    static long febo(int n){
        if (n <= 1) {
            return n;
        }

        return febo(n-1) + febo(n-2);
    }
}
