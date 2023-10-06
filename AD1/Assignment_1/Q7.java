/*Name:Anish More
 Name of the program:Factorial of a number
 */
import java.util.Scanner;

public class Q7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    while (num < 0) {
      System.out.println("Number can't be negative, Enter again:");
      num = sc.nextInt();
    }
    int p = 1;
    for (int i = 1; i <= num; i++) {
      p *= i;
    }
    System.out.println("Factorial of " + num + " is: " + p);
  }
}
/*Output 
Enter the number: 5
Factorial of 5 is: 120
 */
