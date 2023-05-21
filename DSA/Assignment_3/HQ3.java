/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a recursive Java method that determines if a string s is a palindrome, that is, 
 it is equal to its reverse.
Examples of palindromes include 'racecar' and 'gohangasalamiimalasagnahog'.*/
import java.util.Scanner;
public class HQ3 
{
	public static boolean pallindrome(int start,int end,String s)
	{
		if(start<=end)
		{
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			return pallindrome(++start,--end,s);
		}
		return true;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s=sc.next();
		if(pallindrome(0,s.length()-1,s))
			System.out.println(s+" is pallindrome");
		else
			System.out.println(s+" is not pallindrome");
	}
}
/*Output---
Sample run-1:
Enter the string: racecar
racecar is pallindrome

Sample run-2:
Enter the string: gohangasalamiimalasagnahog
gohangasalamiimalasagnahog is pallindrome

Sample run-3:
Enter the string: anish
anish is not pallindrome
*/