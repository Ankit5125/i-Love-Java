package Recursion.Easy;

public class OneToN {
    public static void main(String[] args) {
        printResult(10);
    }

    static void printResult(int num){
        if (num == 0) {
            return;
        }

        printResult(num-1);
        System.out.println(num);
    }
}
