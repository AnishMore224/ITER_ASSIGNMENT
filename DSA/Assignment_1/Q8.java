/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a java program to print M-by-N array in the tabular format. Also, display the sum of
elements of the array. */
import java.util.Scanner;
public class Q8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Row and Columns of 2D-Array: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.print("Enter elements of 2D-Array: ");
		int[][] arr=new int[r][c];
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			 arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			 System.out.print(arr[i][j]+" ");
			 sum+=arr[i][j];
			}
			System.out.println();
		}
		System.out.println("The sum of elements of the 2D-Array is "+sum);
	}
}
/*Output---
Enter number of Row and Columns of 2D-Array: 3 3
Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5
1 2 3 
2 3 4 
3 4 5 
The sum of elements of the 2D-Array is 27
*/