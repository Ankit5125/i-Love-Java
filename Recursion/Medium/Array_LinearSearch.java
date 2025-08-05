public class Array_LinearSearch {
    public static void main(String[] args) {

        int[] arr = { 1, 5, 50, 8, 15, 16, 85, 90, 50, 75 };
        int target = 14;

        System.out.println(linearSearch(arr, target, 0));

    }

    static int linearSearch(int[] arr, int target, int start){
        if (start == arr.length) {
            return -1;
        }

        if (arr[start] == target) {
            return start;
        }
        else{
            return linearSearch(arr, target, ++start);
        }
    }
}
