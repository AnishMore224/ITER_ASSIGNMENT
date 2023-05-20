/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a Java program to read your lucky number from keyboard. Treat –ve no. as NumberFormatException.
  Write appropriate Exceptional handler.*/
import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your lucky number:");
		int n=sc.nextInt();
		try {
			if(n<0)
				throw new NumberFormatException("Negative number");
			System.out.println("Your lucky number is "+n);
			
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
}
/*Output---
Sample run-1:
Enter your lucky number:-120
java.lang.NumberFormatException: Negative number

Sample run-2:
Enter your lucky number:120
Your lucky number is 120
*/