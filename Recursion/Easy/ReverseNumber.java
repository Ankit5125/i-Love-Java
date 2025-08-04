// right method ✅
package Recursion.Easy;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 85208520;
        System.out.println(printReverse(num,(int) Math.log10(num) + 1));
    }

    static int printReverse(int num, int length){
        if (num < 10) {
            return num;
        }

        return num % 10 * (int) Math.pow(10, length-1) + printReverse(num/10, length - 1);
    }
}

// wrong method ❌

// package Recursion.Easy;
// public class ReverseNumber {
//     public static void main(String[] args) {
//         int num = 1234;
//         System.out.println(printReverse(num));
//     }
//     static int printReverse(int num){
//         if (num < 10) {
//             return num;
//         }

//         return num % 10 * 10 + printReverse(num/10);
//     }
// }


/*
 * 1234 ->   4 * 10 + 
 * 123 ->    3 * 10 + 
 * 12 ->     2 * 10 +
 * 1 ->      1
 * 
 * 4 * 10 + (3 * 10 + (2 * 10 + (1)))
 * 4 * 10 + (3 * 10 + (2 * 10 + 1))
 * 4 * 10 + (3 * 10 + (20 + 1)))
 * 4 * 10 + (3 * 10 + (21))
 * 4 * 10 + (3 * 10 + 21)
 * 4 * 10 + (30 + 21)
 * 40 + 51
 * 91
 */

