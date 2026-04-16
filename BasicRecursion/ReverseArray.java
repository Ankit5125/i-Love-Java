package BasicRecursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        printAns(new int[] {1,2,3,4,5,6,7,8,9,10});
    }

    static void printAns(int[] arr){
        int[] reverse = DoReverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(reverse));
    }

    static int[] DoReverse(int[] arr, int start, int end){
        if (start > end) {
            return arr;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return DoReverse(arr, start+1, end-1);
    }
}
