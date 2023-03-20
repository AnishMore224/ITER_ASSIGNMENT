/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a java program that implements the array reversal algorithm suggested in Note 1.
Note 1: There is a simpler algorithm for array reversal that starts out with two indices, i=0
and j=n-1. With each iteration i is increased and j is decreased for i<j.*/
import java.util.Scanner;
public class Q8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms in array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int i=0,j=n-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+"   ");
		}
	}
}
	
/*Output
Enter number of terms in array:5
2
3
1
5
6
6   5   1   3   2   
 */
