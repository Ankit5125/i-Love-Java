package Recursion;

public class NtoOne {
    public static void main(String[] args) {
        printResult(10);
    }

    static void printResult(int num){
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printResult(num-1);
    }
}
