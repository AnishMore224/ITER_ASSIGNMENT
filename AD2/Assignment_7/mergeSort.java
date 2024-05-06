import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort obj = new mergeSort();
        obj.merge_sort(arr, 0, n - 1);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    public void merge_sort(int arr[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            merge_sort(arr, l, mid);
            merge_sort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public void merge(int arr[], int l, int mid, int r) {
        int lenL = mid - l + 1;
        int lenR = r - mid;
        int temp[] = new int[lenL + lenR];
        int i = l, j = mid + 1;
        int k = 0;
        while ((i <= mid) && (j <= r)) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= r)
            temp[k++] = arr[j++];
        for (i = 0; i < lenL + lenR; i++)
            arr[l + i] = temp[i];
    }
}

/*
 * Output--
 * Enter no. of elements: 6
 * 2 4 1 8 3 10
 * After Sorting: [1, 2, 3, 4, 8, 10]
 */