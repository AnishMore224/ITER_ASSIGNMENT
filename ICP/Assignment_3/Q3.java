/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a program that reads three integers from the user 
 and prints "Increasing" if the numbers are in increasing order, "Decreasing" 
 if the numbers are in decreasing order, and "Neither increasing nor decreasing 
 order" otherwise.
Here is sample run:
Input first number: 241
Input second number:345
Input third number: 4563
“Increasing”
Input first number: 345
Input second number:145
Input third number: 563
“Neither Increasing nor decreasing”
Input first number: 45
Input second number:14
Input third number: 3
“Decreasing”.*/
import java.util.Scanner;
public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number: ");
		int a=sc.nextInt();
		System.out.println("Input second number: ");
		int b=sc.nextInt();
		System.out.println("Input third number: ");
		int c=sc.nextInt();
		if(a>b&&b>c)
		{
			System.out.println("Decreasing");
		}
		else if(a<b&&b<c)
		{
			System.out.println("Increasing");
		}
		else
		{
			System.out.println("Neither increasing nor decreasing order");
		}
	}
}
/*output--
Input first number: 
45
Input second number: 
14
Input third number: 
3
Decreasing
*/
