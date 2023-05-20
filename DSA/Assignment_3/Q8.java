/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a recursive method in Java which, given an integer n, print it with its digits reversed. 
 For example, given 4735, it prints 5374*/

import java.util.Scanner;
public class Q8
{
	static int rev=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number that you want to reverse:");
		int n=sc.nextInt();
		System.out.println("The reverse of the given number is: "+reverse(n));
	}
	public static long reverse(int n)
	{
		if(n>0)
		{
			rev=rev*10+(n%10);
			reverse(n/10);
		}
		return rev;
	}
}
/*Output---
Enter the number that you want to reverse:3456
The reverse of the given number is: 6543
*/