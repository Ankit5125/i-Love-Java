package MergeSort;

import java.util.Arrays;
import java.util.Scanner;

public class MyMergeSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter (N): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elemnts : ");
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();

        System.out.println("Sorting Array : ");
        long start = System.nanoTime();
        arr = mergeSort(arr);
        long end = System.nanoTime();

        System.out.println(Arrays.toString(arr));
        System.out.println("Time Taken : " + (end-start) + " ns");

        sc.close();
    }

    public static int[] mergeSort(int[] arr){
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){
        int i = 0, j =0, k = 0;
        int[] ans = new int[left.length + right.length];

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i++];
            }
            else{
                ans[k] = right[j++];
            }
            k++;
        }

        while (i < left.length) {
            ans[k++] = left[i++];
        }

        while (j < right.length) {
            ans[k++] = right[j++];
        }

        return ans;
    }
}
