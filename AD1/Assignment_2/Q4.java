package Assignment_2;
/*Name:Anish More
 Name of the program:Generating nth fibonacci number
 */
import java.util.Scanner;

public class Q4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number n: ");
    int n = sc.nextInt();
    System.out.println(n+"th fibonacci number  is: " + fibonacci(n));
  }

  public static int fibonacci(int n)
  {
    if(n<=1)
    return n;
    return fibonacci(n-1)+fibonacci(n-2);
  }
}
/*Output 
Enter number n: 4
4th fibonacci number  is: 3
 */
