/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a method to add two matrices. The header of the method is as follows:public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or
compatible types of elements.*/
import java.util.Scanner;
public class HQ4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows and columns of the array : ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		double a[][]=new double[r][c];
		System.out.println("Enter array A elements : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextDouble();
			}
		}
		double b[][]=new double[r][c];
		System.out.println("Enter array B elements : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextDouble();
			}
		}
		double c1[][]=addMatrix(a,b);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(c1[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static double[][] addMatrix(double[][] a, double[][] b)
	{
		double c[][]=new double[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}
/*Output---
Enter no. of rows and columns of the array : 3 3
Enter array A elements : 
1.0 2 3
4.5 5 6
7.1 8 9
Enter array B elements : 
1 2 3
4 5 6
7 8 9
2.0 4.0 6.0 
8.5 10.0 12.0 
14.1 16.0 18.0 
*/