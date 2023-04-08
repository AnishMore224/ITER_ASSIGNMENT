/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a java method to calculate the sum of digits of a given number until the number is a
single digit. The method signature is as follows.
public static int sum_Of_Digits(int n)
 */
import java.util.Scanner;
public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int temp=n;
		while(n>9)
		{
			n=sum_Of_Digits(n);
		}
		System.out.println("Sum of digits of "+temp+" until the number is a single digit is "+n);
	}
	public static int sum_Of_Digits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n/=10;
		}
		return sum;
	}
}
/*Output---
Enter a number: 9294
Sum of digits of 9294 until the number is a single digit is 6.
*/