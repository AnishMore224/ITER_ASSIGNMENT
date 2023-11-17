/* Name: Anish More
  Programn: Linear search using recursion*/

package Assignment_5;

import java.util.Scanner;

public class Q2 {
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
        int f = RecLinearSearch(arr, key, n - 1);

        if (f == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index:" + f);
    }

    public static int RecLinearSearch(int arr[], int key, int i) {
        if (i == -1)
            return -1;
        else if (arr[i] == key)
            return i;
        return RecLinearSearch(arr, key, i - 1);
    }
}

/*
 * Output--
 * Sample 1:
 * Enter the size of array
 * 5
 * Enter array elements
 * 2 4 1 8 3
 * Enter key
 * 2
 * Key found at index:0
 
 * Sample 2:
 * Enter the size of array
 * 5
 * Enter array elements
 * 2 4 1 8 3
 * Enter key
 * 0
 * Key not found
 */