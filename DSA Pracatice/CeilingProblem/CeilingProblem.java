public class CeilingProblem {
    public static void main(String[] args) {
        
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr, 9));

    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
}