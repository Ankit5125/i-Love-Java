    package Recursion.Easy;

    public class PalindromeNumber {
        public static void main(String[] args) {
            
            int num = 12345321;
            System.out.println(isPalindrome(num));

        }

        static boolean isPalindrome(int num){
            return helper(num, 0, (int) Math.log10(num) );
        }

        static boolean helper(int num, int start, int end){
            if (start >= end) {
                return true;
            }

            if ( (num /(int) Math.pow(10, start)) % 10 != (num /(int) Math.pow(10, end))%10 ) {
                return false;
            }

            return helper(num, ++start, --end);
        }
    }
