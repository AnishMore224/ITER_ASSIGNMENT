/* Name- Anish more
 Registration no.=2241013365
 name of the program:
Write a java program that gets three integer numbers from the user. Count from the first number
to the second number increments by the third number. Use for loop to do it. Also, display the
sum of numbers displayed between the first number and second number.
Sample run:
Enter first number: 4
Enter second number: 13
Enter third number: 3
4 7 10 13
The sum of number displayed is 34*/
import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		System.out.println("Enter third number: ");
		int c=sc.nextInt();
		for(int i=a;i<=b;i+=c)
		{
			System.out.print(i+" ");
		}
	}
}
		
/*output--
Enter first number: 
4
Enter second number: 
13
Enter third number: 
3
4 7 10 13 

 */











