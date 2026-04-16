package BasicRecursion;

public class PrintOneToN {
    public static void main(String[] args) {
        printAns(10);
    }

    static void printAns(int num){
        if (num == 1) {
            System.out.println(num);
            return;
        }

        printAns(num-1);
        System.out.println(num);
    }
}
