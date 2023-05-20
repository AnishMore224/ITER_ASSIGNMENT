/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a java method using Generics to count the occurrence of an element in an array of any type.
 The signature of count method is given below.
public static <T> int count(T[] array, T item)*/
import java.util.Scanner;
public class Q5
{
	public static <T>int count(T[] array, T item) {
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i].equals(item))
				count++;
		}
		return count;
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
		System.out.println("Enter the element to search: ");
		Integer n=sc.nextInt();
		int count=count(arrInteger,n);
		System.out.println("Number of times "+n+" present in the array is "+count);
	}
}
/*Output---
Enter 5 Integer array elements:
1 2 3 2 5
Enter the element to search: 
2
Number of times 2 present in the array is 2
*/