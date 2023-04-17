/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like
“a + b = c,” “a = b − c,” or “a b = c.”∗ */
import java.util.Scanner;
public class HQ1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter three Numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a+b==c)
			System.out.println("a + b = c");
		else if(a==b-c)
			System.out.println("a = b - c");
		else if(a*b==c)
			System.out.println("a * b = c");
		else
			System.out.println("They can not be used in a correct arithmetic formula");
	}
}
/*Output---
Enter three Numbers : 2 3 6
a * b = c
*/