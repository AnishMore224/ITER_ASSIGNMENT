/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a method to find the largest element present in the Array. The method header is given
below.
public static int max(int[] array)
Write a java program that prompts the user to enter 5 numbers, invokes this method to return
the maximum value, and displays the maximum value. Here is a sample run of the program:
Sample run:
Enter five numbers: 9 5 7 2 3
The maximum number is: 9.*/
import java.util.Scanner;
public class Q5
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
		System.out.println("The maximum number is: "+max(arr));		
	}
	public static int max(int[] array)
	{
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>=max)
				max=array[i];
		}
		return max;
	}
}
	
/*Output
Enter five numbers:
9
5
7
2
3
The maximum number is: 9
 */
