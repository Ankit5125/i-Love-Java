public class Array_LinearSearch {
    public static void main(String[] args) {

        int[] arr = { 1, 5, 50, 8, 15, 16, 85, 90, 50, 15, 75 };
        int target = 15;

        System.out.println(linearSearch(arr, target, 0));
        System.out.println(linearSearchFromBack(arr, target, arr.length-1));

    }

    public static int linearSearchFromBack(int[] arr, int target, int last) {
        if (last == -1) {
            return last;
        }

        if (arr[last] == target) {
            return last;
        }
        else
            return linearSearch(arr, target, --last);
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
