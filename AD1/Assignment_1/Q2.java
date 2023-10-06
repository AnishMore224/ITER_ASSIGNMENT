/*Name:Anish More
 Name of the program:Finding maximum and minimum
 */
import java.util.Scanner;

public class Q2 {

  public static void main(String[] args) {
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
      if (arr[i] > max) {
        max = arr[i];
      }
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    System.out.println("Maximum Number: " + max);
    System.out.println("Minimum Number: " + min);
  }
}
/*Output 
Enter number of elements: 5
Enter a number: 0           
Enter a number: 50
Enter a number: -9
Enter a number: 52
Enter a number: 1
Maximum Number: 52
Minimum Number: -9
 */
