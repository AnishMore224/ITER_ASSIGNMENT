/* Name: Anish More
  Programn: Binary search using recursion
 */
package Assignment_5;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter array elements");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key");
        int key = sc.nextInt();
        int f = RecBinarySearch(arr, key, 0, n - 1);

        if (f == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index:" + f);
    }

    public static int RecBinarySearch(int arr[], int key, int i, int j) {
        if (i > j)
            return -1;
        int mid = i + (j - i) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] < key)
            return RecBinarySearch(arr, key, mid + 1, j);
        return RecBinarySearch(arr, key, i, mid - 1);
    }
}

/*
 * Output--
 * Sample 1:
 * Enter the size of array
 * 5
 * Enter array elements
 * 2 3 5 6 7
 * Enter key
 * 2
 * Key found at index:0
 * 
 * 
 * Sample 2:
 * Enter the size of array
 * 5
 * Enter array elements
 * 2 3 5 6 7
 * Enter key
 * 9
 * Key not found
 */