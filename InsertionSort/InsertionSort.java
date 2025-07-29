package InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter (N) : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Sorting Array : ");
        long start = System.nanoTime();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    arr[j] += arr[j-1];
                    arr[j-1] = arr[j] - arr[j-1];
                    arr[j] = arr[j] - arr[j-1];
                }
                else{
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        long end = System.nanoTime();
        System.out.println(Arrays.toString(arr));
        System.out.println("Time Taken : " + (end-start) + " ns");
        sc.close();
    }
}
