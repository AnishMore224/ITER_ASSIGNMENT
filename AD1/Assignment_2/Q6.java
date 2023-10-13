package Assignment_2;
/*Name:Anish More
 Name of the program:Conversion from decimal number to hexadecimal equivalent number
 */
import java.util.Scanner;

public class Q6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number n: ");
    int n = sc.nextInt();
    char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    System.out.println("Hexadecimal number  is: " + Hex(n,ch));
  }

  public static String Hex(int n,char ch[])
  {
    if(n<=15)
    return ""+ch[n];
    return Hex(n/16, ch)+ch[n%16];
  }
}
/*Output 
Enter number n: 4
4th fibonacci number  is: 3
 */
