/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a java program to create an array of size N and store the random values between 1 to 100 in it and print the number of prime numbers present in the array.
Sample run:
Enter number of elements 5
Enter Array elements:
11 22 33 39 43
The number of prime numbers are 2.*/
import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int c=0,c1=0;
		
		for(int i=0;i<n;i++)
		{
			c=0;
			arr[i]=sc.nextInt();
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
					c++;
			}
			if(c==0)
				c1++;
		}
		System.out.println("The number of prime numbers are "+c1);		
	}
}
	
/*Output
Enter number of terms 5
11
22
33
39
43
The number of prime numbers are 2

 */
