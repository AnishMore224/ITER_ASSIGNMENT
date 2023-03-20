/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a Java program that takes a year from user and print 
 true if that year is a leap year otherwise print false.
Here is a sample run:
Input the year: 2016
2016 is a leap year: true
Input the year: 2008
2008 is a leap0 year: false
Input the year: 1900
1900 is a leap year: false*/
import java.util.Scanner;
public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year: ");
		int y=sc.nextInt();
		if((y%4==0&&y%100!=0)||y%400==0)
		{
			System.out.println(y+" is a leap year :true");
		}
		else
		{
			System.out.println(y+" is a leap year :false");
		}
	}
}
/*output--
Enter a year: 
1900
1900 is a leap year :false
*/
