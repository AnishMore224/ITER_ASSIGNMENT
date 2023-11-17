/* Name: Anish More
  Programn: Given an array of integers, find the element pair with minimum/maximum difference
 */
package Assignment_6;

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

    int max = arr[0], f = 0;
    for (i = 1; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
        f = i;
      }
    }
    int mindiff = max, maxdiff = 0;
    for (i = 0; i < n; i++) {
      if (i != f) {
        mindiff = Math.min(Math.abs(max - arr[i]), mindiff);
        maxdiff = Math.max(Math.abs(max - arr[i]), maxdiff);
      }
    }
    System.out.println("Minimum difference is:" + mindiff);
    System.out.println("Maximum difference is:" + maxdiff);
  }
}
/*
 Output--
Sample 1:
Enter the size of array
7
Enter array elements
3 7 2 7 4 3 2
Minimum difference is:0
Maximum difference is:5

Sample 2:
Enter the size of array
7
Enter array elements
3 7 2 1 4 3 2 
Minimum difference is:3
Maximum difference is:6
 */
