package BasicRecursion;

public class SumOfN {
    public static void main(String[] args) {
        printAns(10);
    }

    static void printAns(int num){
        int javab = Sum(num, 0);
        System.out.println(javab);
    }

    static int Sum(int num, int javab){
        if (num == 0) {
            return javab;
        }

        return Sum(num-1, javab + num);
    }
}
