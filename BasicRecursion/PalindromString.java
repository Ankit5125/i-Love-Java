package BasicRecursion;

public class PalindromString {
    public static void main(String[] args) {

        printAns("121");

    }

    static void printAns(String s) {
        System.out.println(isPalindrom(s, 0, s.length() - 1));
    }

    static boolean isPalindrom(String s, int start, int end) {
        if (start > end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrom(s, start + 1, end - 1);
    }
}
