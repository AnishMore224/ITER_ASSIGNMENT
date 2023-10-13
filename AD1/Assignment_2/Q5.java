package Assignment_2;
/*Name:Anish More
 Name of the program:Finding the GCD
 */
import java.util.Scanner;

public class Q5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number : ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number : ");
    int b = sc.nextInt();
    System.out.println("The gcd of the numbers  is: " + gcd(a,b));
  }

  public static int gcd(int a,int b)
  {
    if(a%b==0)
    {
        return b;
    }
    return gcd(b,a%b);
  }
}
/*Output 
Enter 1st number : 68 
Enter 2nd number : 119
The gcd of the numbers  is: 17
 */
