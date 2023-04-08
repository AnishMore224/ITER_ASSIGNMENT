/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a Java program that can take a positive integer greater than 2 as input and write out the
number of times one must repeatedly divide this number by 2 before getting a value less
than 2.
 */
import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a positive integer greater than 2 ");
		int n=sc.nextInt();
		int c=0;
		while(n>=2)
		{
			c++;
			n/=2;
		}
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+c);
	}
}
/*Output---
Enter a positive integer greater than 2 67
The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is 6
*/