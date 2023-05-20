/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a recursive Java method that takes a character string s and outputs its reverse. 
 For example, the reverse of ' pots&pans' would be ' snap&stop'.*/
import java.util.Scanner;
public class Q10
{
	static int rev=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String:");
		String s=sc.next();
		System.out.println("Reverse of the string is: "+reverse(s));
	}
	public static String reverse(String s)
	{
		if(s.length()==1)
			return s;
		return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
	}
}
/*Output---
Enter String:pots&pans
Reverse of the string is: snap&stop
*/