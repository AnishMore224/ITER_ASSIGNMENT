/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a Java program that takes all the lines input to standard input and writes them to
standard output in reverse order. That is, each line is output in the correct order, but the
ordering of the lines is reversed. */
import java.util.Scanner;
public class HQ2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of lines");
		int n=sc.nextInt();
		System.out.println("Enter the String : ");
		String arr[]=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		arr[i]=sc.nextLine();
		System.out.println("Reverse-->");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
/*Output---
Enter no. of lines
3
Enter the String : 
hello everyone
anish here
how are you
Reverse-->
how are you
anish here
hello everyone

*/