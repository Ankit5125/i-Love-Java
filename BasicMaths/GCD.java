package BasicMaths;

public class GCD {
    public static void main(String[] args) {
        
        printAns(20,15);

    }

    static void printAns(int n1, int n2){
        int min = Math.min(n1, n2);
        int ans = 1;
        for (int i = 2; i < min; i++) {
            if(n1 % i == 0 && n2 % i == 0){
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
