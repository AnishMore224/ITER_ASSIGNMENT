package Assignment_2;
/*Name:Anish More
 Name of the program:Computing nth power of a number
 */
import java.util.Scanner;

public class Q7 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number n: ");
    int n = sc.nextInt();
    System.out.print("Enter power: ");
    int p = sc.nextInt();
    System.out.println(p+"th power of "+n+"  is: " + power(n,p));
  }

  public static int power(int n,int p)
  {
    if(p==0)
    {
        return 1;
    }
    return n*power(n, p-1);
  }
}
/*Output 
Enter number n: 2
Enter power: 5
5th power of 2  is: 32
 */
