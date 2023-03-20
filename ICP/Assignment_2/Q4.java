/*Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program that reads an integer between 0 and 1000 and adds all the digits in the
integer. For example, if an integer is 749, the sum of all its digits is 20.
 */
import java.util.Scanner;
public class Q4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int n=sc.nextInt();
		int r1=n%10;
		n/=10;
		int r2=n%10;
		n/=10;
		int r3=n%10;
		n/=10;
		System.out.println("The sum of the digits is "+(r1+r2+r3));
	}
}
/*Output---
Enter a number between 0 and 1000: 
999
The sum of the digits is 27
*/