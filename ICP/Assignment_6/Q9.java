/*Name-Anish More
  Registration number:2241013365
  Name of the program:Some websites impose certain rules for passwords.
Write a method that checks whether a string is a valid password. Suppose the password rules
are as follows:
 A password must have at least eight characters.
 A password consists of only letters and digits.
 A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid Password if the
rules are followed or Invalid Password otherwise.*/
import java.util.Scanner;
public class Q9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String ");
		String s=sc.next();
		boolean b=isValid(s);
		if(b)
		System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
	public static boolean isValid(String str)
	{
		int count=str.length();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
					continue;
			else if(ch>='0'&&ch<='9')
				c++;
			else
				return false;
		}
		return count>=8&&c>=2;
		}
	}
	
/*Output
Enter String anishmore12
Valid Password
 */
