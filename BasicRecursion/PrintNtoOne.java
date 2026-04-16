package BasicRecursion;

public class PrintNtoOne {
    public static void main(String[] args) {
        printAns(10);
    }

    static void printAns(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }

        System.out.println(num--);
        printAns(num);
    }
}
