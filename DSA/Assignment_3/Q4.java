/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a java program to print an array of different type using a single Generic method. 
 The signature of printArray method is given below.
public static < E > void printArray( E[] inputArray)*/
import java.util.Scanner;
public class Q4
{
	public static < E > void printArray( E[] inputArray) {
		for(int i=0;i<inputArray.length;i++)
		{
			System.out.print(inputArray[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Integer arrInteger[]=new Integer[5];
		System.out.println("Enter 5 Integer array elements:");
		for(int i=0;i<arrInteger.length;i++)
		{
			arrInteger[i]=sc.nextInt();
		}
		System.out.println("Integer Array contains:");
		printArray(arrInteger);
		
		Double arrDouble[]=new Double[5];
		System.out.println("\nEnter 5 Double array elements:");
		for(int i=0;i<arrDouble.length;i++)
		{
			arrDouble[i]=sc.nextDouble();
		}
		System.out.println("Double Array contains:");
		printArray(arrDouble);
	}
}
/*Output---
Enter 5 Integer array elements:
1 2 3 4 5
Integer Array contains:
1  2  3  4  5  
Enter 5 Double array elements:
1.2 2.2 3.3 4.4 5.5
Double Array contains:
1.2 2.2 3.3 4.4 5.5 
*/