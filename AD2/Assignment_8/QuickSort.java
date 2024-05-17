package Assignment_7;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        QuickSort obj = new QuickSort();
        obj.Quick_Sort(arr, 0, n - 1);
        System.out.println("After Sorting:" + Arrays.toString(arr));
    }

    void Quick_Sort(int arr[], int start, int end) {
        if (start < end) {
            int p = partition(arr, start, end);
            Quick_Sort(arr, start, p - 1);
            Quick_Sort(arr, p + 1, end);

        }
    }

    public int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int k = start - 1, temp;
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                temp = arr[k + 1];
                arr[k + 1] = arr[i];
                arr[i] = temp;
                k++;
            }
        }
        temp = arr[k + 1];
        arr[k + 1] = arr[end];
        arr[end] = temp;
        return k + 1;
    }
}
/*
 * Output--
 * Enter array length:8
 * 6 1 3 10 4 2 8 0
 * After Sorting:[0, 1, 2, 3, 4, 6, 8, 10]
 */