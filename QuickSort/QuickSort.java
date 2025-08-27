package QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        quicksort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));

    }

    static void quicksort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int pivot = nums[start + (end - start) / 2];

        while (start <= end) {

            // bring start to number > pivot
            while (nums[start] < pivot) {
                start++;
            }
            // brin end to number < pivot
            while (nums[end] > pivot) {
                end--;
            }
            // swap the numbers
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // now.... pivot is at correct index
        // sort two half partitions
        quicksort(nums, low, end);
        quicksort(nums, start, high);
    }
}
