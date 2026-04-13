package BasicMaths;

public class isPrime {
    public static void main(String[] args) {
        printAns(1);
        printAns(2);
        printAns(3);
        printAns(7);
        printAns(6);
    }

    static void printAns(int num){

        if (num == 1 || num == 2) {
            System.out.println("YES");
            return;
        }
        else if (num <= 0) {
            System.out.println("NO");
            return;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
