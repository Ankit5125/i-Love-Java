public class Array_BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {10,20,32,36,50,60,65,68,75,99};
        int target = 3600;

        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target){
       return helper(arr, target, 0, arr.length-1);
    }

    static int helper(int[] arr, int target, int start, int end){
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        else if(arr[mid] > target){
            return helper(arr, target, start, mid -1);
        }
        else{
            return helper(arr, target, mid+1, end);
        }
    }
}
