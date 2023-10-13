package Assignment_2;
/*Name:Anish More
 Name of the program:Factorial of a given number n
 */
import java.util.Scanner;

public class Q3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number n: ");
    int n = sc.nextInt();
    System.out.println("Factorial of n is: " + Factorial(n));
  }

  public static int Factorial(int n)
  {
    if(n==1)
    return 1;
    return n*Factorial(n-1);
  }
}
/*Output 
Enter number n: 5
Factorial of n is: 120
 */
