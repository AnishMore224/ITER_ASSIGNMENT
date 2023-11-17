/* Name: Anish More
  Programn: Given a list n numbers, find the element which appears maximum number of times.
 */
package Assignment_6;

import java.util.Scanner;

public class Q5 {

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

    int max = arr[0];
    for (i = 1; i < n; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }

    int count[] = new int[max + 1];
    for (i = 0; i < n; i++) {
      count[arr[i]]++;
    }

    int maxcount=count[0],index=0;

    for (i = 1; i <= max; i++) {
      if (count[i] > maxcount) 
        {
            maxcount=count[i];
            index=i;
        }
    }
    System.out.println("Element which appears maximum number of times is:"+index);
  }
}
/*
 Output--
Sample 1:
Enter the size of array
7
Enter array elements
3 2 1 3 5 5 5
Element which appears maximum number of times is:5

Sample 2:
Enter the size of array
6
Enter array elements
0 0 1 1 2 2
Element which appears maximum number of times is:0
 */
