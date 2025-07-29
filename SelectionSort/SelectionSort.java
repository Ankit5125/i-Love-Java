package SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (N) : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Values : ");
        for(int i = 0 ; i < n ; i++)
            arr[i] = sc.nextInt();

        System.out.println("\nSorting Array :");
        long start = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index != i) {
                arr[i] += arr[index];
                arr[index] = arr[i] - arr[index];
                arr[i] = arr[i] - arr[index];
            }
        }
        long end = System.nanoTime();
        System.out.println("Time Taken : " + (end-start) + " ns");
        sc.close();
    }
}
