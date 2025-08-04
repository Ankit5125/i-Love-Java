package Recursion;

public class SumofNtoOne {
    public static void main(String[] args) {
        
        int num = 10;
        System.err.println(printSum(num));
    }
    static int printSum(int num){
        if (num == 0) {
            return num;
        }
        return printSum(num-1) + num ;
    }
}
