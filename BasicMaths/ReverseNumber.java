package BasicMaths;

public class ReverseNumber {

    public static void main(String[] args) {
        printAns(12345);
    }

    static void printAns(int num){

        int ans = 0;
        while (num > 0) {
            ans = ans * 10 + num % 10;
            num /= 10;
        }

        System.out.println(ans);
    }
}