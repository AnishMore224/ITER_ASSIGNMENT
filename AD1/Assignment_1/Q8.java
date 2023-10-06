/*Name:Anish More
 Name of the program:Generating nth fibonacci number
 */
import java.util.Scanner;

public class Q8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = sc.nextInt();
    int x = 0, y = 1, c;
    for (int i = 1; i < num; i++) {
      c = x + y;
      x = y;
      y = c;
    }
    System.out.println(num + "th fibonacci number is: " + x);
  }
}
/*Output 
Enter the number: 10
10th fibonacci number is: 34
 */
