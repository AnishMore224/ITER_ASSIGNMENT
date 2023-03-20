/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a Java method to count all words in a string.
Example: Input the string:
The quick brown fox jumps over the lazy dog.
Expected Output:
Number of words in the string: 9.*/
import java.util.Scanner;
public class HQ4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String ");
		String s=sc.nextLine();
		System.out.println("Number of words in the string: "+count(s));
	}
	public static int count(String s)
	{
		int c=0;
		s=s+" ";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')
				c++;
		}
		return c;
	}
}
/*Output
Enter String The quick brown fox jumps over the lazy dog.
Number of words in the string: 9
 */
