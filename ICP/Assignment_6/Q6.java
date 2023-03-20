/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a method that finds the number of occurrences of a specified character in a string using
the following header:
public static int count(String str, char a)For example, count ("Welcome", 'e') returns 2.
Write a java program that prompts the user to enter a string followed by a character and
displays the number of occurrences of the character in the string.*/
import java.util.Scanner;
public class Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String");
		String s=sc.next();
		System.out.print("Enter character to be counted ");
		char a=sc.next().charAt(0);
		System.out.println("No. of occurrences= "+count(s.toLowerCase(),a));
	}
	public static int count(String str, char a)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==a)
				c++;
		}
		return c
				;
	}
	
}
/*Output
Enter String Welcome
Enter character to be counted e
No. of occurrences= 2
 */
