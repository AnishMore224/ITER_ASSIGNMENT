/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a java program to check whether a number is a spy number or not.
 */
import java.util.Scanner;
public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int sum=0;
		int product=1,rem;
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum+=rem;
			product*=rem;
			n/=10;
		}
		if(sum==product)
			System.out.println(temp + " is a spy number.");
		else
			System.out.println(temp + " is not a spy number.");
	}
}
/*Output---
Enter a number: 1124
1124 is a spy number.
*/