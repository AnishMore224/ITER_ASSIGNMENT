/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write the methods with the following headers
// Return the reversal of an integer. Example: reverse (456), returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is
the same as itself. Write a java program that prompts the user to enter an integer and reports
whether the integer is a palindrome.*/
import java.util.Scanner;
public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
			System.out.println("Is number pallindrome "+isPalindrome(n));
	}
	public static int reverse(int number)
	{
		int rev=0;
		while(number!=0)
		{
			rev=rev*10+number%10;
			number/=10;
		}
		return rev;
	}
	public static boolean isPalindrome(int number) 
	{
		if(reverse(number)==number)
			return true;
		return false;
	}
	
}
/*Output
Enter number:121
Is number pallindrome true
 */
