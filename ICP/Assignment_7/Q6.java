/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a method to find the second smallest element present in the Array. The method header
is given below.
public static double sec_small(double[] array)
Write a java program that prompts the user to enter ten numbers, invokes this method to return
the second minimum value, and displays the second minimum value. Here is a sample run of the
program:
Sample run:
Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
The second minimum number is: 1.9*/
import java.util.Scanner;
public class Q6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double arr[]=new double[10];
		System.out.println("Enter ten numbers:");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextDouble();
		}
		System.out.println("The second minimum number is: "+min(arr));		
	}
	public static double min(double[] array)
	{
		double min=Integer.MAX_VALUE;
		double min1=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min1=min;
				min=array[i];
			}
			else if(array[i]<min1 && array[i]!=min)
				{
					min1=array[i];
				}
		}
		return min1;
}
}
	
/*Output
Enter ten numbers:
1.9
2.5
3.7
2
1.5
6
3
4
5
2
The second minimum number is: 1.9
 */
