/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a Java program that takes two arrays a and b of length n storing int values, and returns
the dot product of a and b. That is, it returns an array c of length n such that c[i] = a[i] · b[i],
for i = 0, . . . , n − 1. */
import java.util.Scanner;
public class HQ3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.print("Enter array A elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter array B elements : ");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[n];
		System.out.println("Dot product----");
		for(int i=0;i<n;i++)
		{
			c[i]=a[i]*b[i];
			System.out.print(c[i]+" ");
		}
		
	}
}
/*Output---
Enter the length of the array : 5
Enter array A elements : 1 2 3 4 5
Enter array B elements : 1 2 3 4 5
Dot product----
1 4 9 16 25 
*/