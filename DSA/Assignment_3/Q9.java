/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers, 
 each is the sum of the preceding two. Write a recursive method in Java which, given n, returns the nth Fibonacci number.*/
import java.util.Scanner;
public class Q9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter one number:");
		int n=sc.nextInt();
		System.out.println("Fibonacci number at position "+n+" is: "+fibonacci(n));
	}
	public static long fibonacci(int n)
	{
		if(n<=1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
/*Output---
Enter one number:10
Fibonacci number at position 10 is: 55
*/