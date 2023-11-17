/* Name: Anish More
  Programn: Print duplicates in a list
 */
package Assignment_6;

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

    System.out.println("Repeated elements are:");
    for (i = 0; i <= max; i++) {
      if (count[i] > 1) 
        System.out.print(i+"  ");
    }
  }
}
/*
 Output--
Sample 1:
Enter the size of array
7
Enter array elements
5 7 3 7 2 5 1
Repeated elements are:
5  7


 */
