/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix,
and finds the first row and column with the most 1s.
*/
import java.util.Scanner;
public class HQ5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				a[i][j]=(int)(Math.random()*2);
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		int rowcount=0,columncount=0;
		int rowindex=-1,columnindex=-1;
		for(int i=0;i<4;i++)
		{
			int rc =0;
			int cc=0;
			for(int j=0;j<4;j++)
			{
				if(a[i][j]==1)
					rc++;
				if(a[j][i]==1)
					cc++;
			}
			if(rc>rowcount)
			{
				rowcount=rc;
				rowindex=i;
			}
			if(cc>columncount)
			{
				columncount=cc;
				columnindex=i;
			}
		}
		System.out.println("The largest row index: "+rowindex);
		System.out.println("The largest column index: "+columnindex);
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