import java.util.*;

public class InversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        InversionCount obj = new InversionCount();
        int invCount = obj.merge_sort(arr, 0, n - 1);
        System.out.println("No. of inversions: " + invCount);
        System.out.println("After Sorting: " + Arrays.toString(arr));

    }

    public int merge_sort(int arr[], int l, int r) {
        int c = 0;
        if (l < r) {
            int mid = (l + r) / 2;
            c += merge_sort(arr, l, mid);
            c += merge_sort(arr, mid + 1, r);
            c += merge(arr, l, mid, r);
        }
        return c;
    }

    public int merge(int arr[], int l, int mid, int r) {
        int lenL = mid - l + 1;
        int lenR = r - mid;
        int temp[] = new int[lenL + lenR];
        int i = l, j = mid + 1;
        int k = 0;
        int count = 0;
        while ((i <= mid) && (j <= r)) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }
        while (i <= mid)
            temp[k++] = arr[i++];
        while (j <= r)
            temp[k++] = arr[j++];
        for (i = 0; i < lenL + lenR; i++)
            arr[l + i] = temp[i];
        return count;
    }
}

/*
 * Output--
 * Enter no. of elements: 6
 * 2 4 1 8 3 10
 * No. of inversions
 * After Sorting: [1, 2, 3, 4, 8, 10]
 */