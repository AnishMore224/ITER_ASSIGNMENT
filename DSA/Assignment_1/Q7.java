/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs. */
import java.util.Scanner;
public class Q7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elements of Array: ");
		int n=sc.nextInt();
		System.out.print("Enter elements of the array: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0],max=arr[0],maxindex=0,minindex=0;
		int mincount=1;
		int maxcount=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				maxcount++;
				maxindex=i;
			}
			if(arr[i]<=min)
			{
				min=arr[i];
				mincount++;
				minindex=i;
			}
			
		}
		System.out.println("Maximum element of Array is "+max+" and occurs "+maxcount+" times.");
		System.out.println("Minimum element of Array is "+min+" and occurs "+mincount+" times.");
		System.out.println("First occurrence of maximum element is at position: "+(1+maxindex));
		System.out.println("First occurrence of minimum element is at position: "+(1+minindex));
		
	}
}
/*Output---
Enter number of elements of Array: 5
Enter elements of the array: 12 14 12 14 13
Maximum element of Array is 14 and occurs 2 times.
Minimum element of Array is 12 and occurs 2 times.
First occurrence of maximum element is at position: 2
First occurrence of minimum element is at position: 3
*/