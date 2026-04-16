package BasicRecursion;

public class Factorial {
    public static void main(String[] args) {
        
        printAns(5);

    }

    static void printAns(int num){
        int javab = fact(num, 1);
        System.out.println(javab);
    }

    static int fact(int num, int ans){
        if (num == 1) {
            return ans;
        }

        return fact(num-1, ans * num);
    }
}
