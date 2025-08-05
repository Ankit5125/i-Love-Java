import java.util.Arrays;

public class Array_SortedOrNot {

    public static void main(String[] args) {
        
        int[] arr = {10, 9, 8, 7, 3, 6, 5, 4, 2, 1};
        Arrays.sort(arr);

        System.out.println(isSorted(arr,0 ,arr.length));
    }

    static boolean isSorted(int[] arr,int start, int length){
        if (start == length-1) {
            return true;
        }

        return arr[start] < arr[start+1] && isSorted(arr, ++start, length);
    }
}