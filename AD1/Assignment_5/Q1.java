/* Name: Anish More
  Programn: Linear search without recursion
 */
package Assignment_5;

import java.util.Scanner;

public class Q1 {
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
        int key = sc.nextInt(), f = -1;
        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                f = i;
                break;
            }
        }
        if (f == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index:" + f);
    }
}


/*
 Output--
Sample 1:
Enter the size of array
5
Enter array elements
2 1 6 3 9
Enter key
3
Key found at index:3


 */