package TimeAnalysis;

import java.util.Scanner;

public class Linear_Binary_Search {
    static int binarySearch(int n, int[] arr, int x){
        
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
                return mid;
            }
        }
        return -1;
    }

    static int linearSearch(int n, int[] arr, int x){
        for(int i = 0 ; i < n ; i++){
            if (arr[i] == x) {
                System.out.println("Value at Index : " + i);
                return i;
            }
        }
        return -1;
    }
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

        long start = System.nanoTime();
        binarySearch(n, arr, x);
        long end = System.nanoTime();

        System.out.println("Time = " + (end - start));

        start = System.nanoTime();
        linearSearch(n, arr, x);
        end = System.nanoTime();

        System.out.println("Time = " + (end - start));
        sc.close();
    }
}
