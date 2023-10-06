/*Name:Anish More
 Name of the program:Smallest positive missing number
 */
import java.util.Scanner;

public class Q5 {

//Method 1
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int sum = (n + 2) * (n + 1) / 2, i;
    System.out.print("Enter Elements: ");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      sum -= arr[i];
    }
    System.out.println("Missing number is: " + sum);
  }
}



//Method 2
/*
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n + 1];
    int i;
    System.out.println("Enter Elements");
    for (i = 0; i < n; i++) {
      arr[sc.nextInt() - 1]++;
    }
    for (i = 0; i < n + 1; i++) {
      if (arr[i] == 0) {
        System.out.println("Missing number is: " + (i + 1));
        break;
      }
    }
  }
 */

 
/*Output 
Enter number of elements: 5
Enter Elements: 2 3 4 1 6
Missing number is: 5
 */
