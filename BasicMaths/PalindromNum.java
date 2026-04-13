package BasicMaths;

public class PalindromNum {
    public static void main(String[] args) {

        printAns(12345);

    }

    static void printAns(int num) {

        int rev = 0;
        int dub = num;

        while (dub > 0) {
            rev = rev * 10 + dub % 10;
            dub /= 10;
        }

        if (rev == num)  {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
