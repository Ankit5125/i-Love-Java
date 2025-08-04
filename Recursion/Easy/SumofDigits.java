package Recursion.Easy;

public class SumofDigits {
    public static void main(String[] args) {
        int num = 8520963;
        System.out.println(printSum(num));
    }
    static int printSum(int num){
        if (num < 10) {
            return num;
        }
        return num % 10 + printSum(num/10);
    }
}
