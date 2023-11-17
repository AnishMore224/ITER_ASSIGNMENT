/* Name: Anish More
  Programn: Find the missing number in an array
 */
package Assignment_6;

import java.util.Scanner;

public class Q3 {

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

    int count[] = new int[n+1];
    for (i = 0; i < n; i++) {
      count[arr[i]-1]++;
    }

    for (i = 0; i <=n; i++) {
      if (count[i] ==0) 
        System.out.print("Missing number is:"+(i+1));
    }
  }
}
/*
 Output--
Sample 1:
Enter the size of array
6
Enter array elements
5 3 7 1 2 4
Missing number is:6

Sample 2:
Enter the size of array
6
Enter array elements
1 3 2 6 4 5
Missing number is:7
 */
