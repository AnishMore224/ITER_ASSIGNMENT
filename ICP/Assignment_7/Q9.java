/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a method to find the element present in the Array using Linear Search. The method
header is given below.
public static int Lsearch(int[] array, item)
The method will return the index of the item if the element is present in the array. Otherwise it will
return -1. Write a java program that prompts the user to enter 5 numbers, and the item to search, then
invokes this method to display whether the element is present in the array. Here is a sample run of the
program:
Sample run:
Enter ten numbers: 9 5 7 2 6
Enter the item to search: 7
The element is present in the array at position: 3*/
import java.util.Scanner;
public class Q9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("Enter five numbers: ");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the item to search: ");
		int item=sc.nextInt();
		System.out.println("The element is present in the array at position: "+Lsearch(arr,item));
	}
	public static int Lsearch(int[] array,int item) 
	{
		for(int i=0;i<5;i++)
		{
			if(array[i]==item)
				return i+1;
		}
		return -1;
	}
}
	
/*Output
Enter five numbers: 9
5
7
2
6
Enter the item to search: 7
The element is present in the array at position: 3
 */
