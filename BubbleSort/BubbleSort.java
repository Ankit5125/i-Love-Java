package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
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
            boolean didSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j+1] < arr[j]) {
                    arr[j] += arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                didSwap = true;
                }
            }
            if (!didSwap) {
                break;
            }
        }
        long end = System.nanoTime();
        System.out.println("Time Taken : " + (end-start) + " ns");
        sc.close();
    }
}