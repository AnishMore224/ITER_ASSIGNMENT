/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a method to find the second largest element present in the Array. The method header is
given below.
public static int sec_max(int[] array)
Write a java program that prompts the user to enter 5 numbers, invokes this method to return
the maximum value, and displays the maximum value. Here is a sample run of the program:
Sample run:
Enter ten numbers: 9 5 7 2 3
The second maximum number is: 7*/
import java.util.Scanner;
public class Q7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter five numbers:");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The second  maximum number is: "+max(arr));		
	}
	public static int max(int[] array)
	{
		int max=Integer.MIN_VALUE;
		int max1=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max1=max;
				max=array[i];
			}
			else if(array[i]>max1 && array[i]!=max)
				{
					max1=array[i];
				}
		}
		return max1;
	
}
}
	
/*Output
Enter five numbers:
9
5
7
3
2
The second  maximum number is: 7
 */
