/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is
as follows.
public static boolean isOdd(int n)
 */
import java.util.Scanner;
public class Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(n+" is odd: "+isOdd(n));
	}
	public static boolean isOdd(int n)
	{
		return (n&1)==1;
	}
}
/*Output---
Enter a number: 13
13 is odd: true
*/