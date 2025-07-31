public class FindUniqueBitwise {
    public static void main(String[] args) {
        
        // find the duplicate element
        int[] arr = { 2, 3, 4, 5, 2, 4, 3};
        // here ans = 5

        int ans = 0;
        for (int num : arr) {
             ans ^= num;
        }
        System.out.println(ans);
    }
}
