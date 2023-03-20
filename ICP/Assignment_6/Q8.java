/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a java method to check a string is palindrome or not.*/
import java.util.Scanner;
public class Q8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String ");
		String s=sc.next();
		System.out.println("Is string pallindrome= "+isPallindrome(s));
	}
	public static boolean isPallindrome(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			s=str.charAt(i)+s;
		}
		return s.equalsIgnoreCase(str);
	}
	
}
/*Output
Enter String mam
Is string pallindrome= true
 */
