public class SquareRoot {
    public static void main(String[] args) {

        int num = 34;

        System.out.println(printSroot_Brutforce(num));
        System.out.println(printSroot_BinarySearch(num));

    }

    static int printSroot_Brutforce(int num) {
        int ans = 0;
        while (ans * ans < num) {
            // System.out.println(ans);
            ans++;
        }
        if (ans * ans > num) {
            // ans does not exist at all
            return -1;
        }
        // ans founded
        return ans;
    }

    static int printSroot_BinarySearch(int num) {
        int start = 0;
        int end = num;

        while (start < end) {
            int mid = start + (end - start) / 2;
            // System.out.println("Start: " + start + "\tEnd: " + end + "\t\tMid: " + mid);
            if (mid * mid == num) {
                // ans founded succefully
                return mid;
            } else if (mid * mid > num) {
                end--;
            } else {
                start++;
            }
        }

        // ans not founded at all
        return -1;
    }
}
