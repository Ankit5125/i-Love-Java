package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (N) : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Values : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter Element : ");
        int x = sc.nextInt();

        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > x) {
                end = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;                
            } else {
                System.out.println("Value at Index : " + mid);
                break;
            }
        }

        sc.close();
    }
}
