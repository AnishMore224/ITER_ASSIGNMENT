/*Name:Anish More
 Name of the program:Sum of n numbers(n>0)
 */
import java.util.Scanner;

public class Q1 {

  public static void main(String[] args) {
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n;) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
      if (arr[i] < 0) {
        System.out.println("Number can't be negative ");
        continue;
      }
      sum += arr[i];
      i++;
    }
    System.out.println("Sum of Elements: " + sum);
  }
}
/*Output 
Enter number of elements: 5
Enter a number: 2  
Enter a number: 3
Enter a number: -3
Number can't be negative 
Enter a number: 5
Enter a number: 7
Enter a number: 6
Sum of Elements: 23
 */
