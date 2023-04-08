/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:
public static double sumMajorDiagonal(double[][] m)
Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
major diagonal. */
import java.util.Scanner;
public class Q9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] arr=new double[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
			 arr[i][j]=sc.nextDouble();
			}
		}
		
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(arr));
	}
	public static double sumMajorDiagonal(double[][] m)
	{
		double sum=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
			 if(i==j)
			 sum+=m[i][j];
			}
		}
		return sum;
	}
}
/*Output---
Enter a 4-by-4 matrix row by row: 
1 2 3 4.0
5 6.5 7 8
9 10 11 12
13 14 15 16
Sum of the elements in the major diagonal is 34.5
*/