/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a Java method to display the middle character of a string.
Note:
a) If the length of the string is odd there will be one middle characters.
b) If the length of the string is even, then there would be two middle characters, we need to print the second middle character.
Example: Input a string: ABC
Expected Output:
The middle character in the string: B
Example: Input a string: JAVA
Expected Output:
The middle character in the string: V.*/
import java.util.Scanner;
public class HQ3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String ");
		String s=sc.next();
		System.out.println("The middle character in the string:"+middle(s));
	}
	public static char middle(String s)
	{
		int m=(int)Math.floor(s.length()/2 );
		return s.charAt(m);
	}
}
/*Output
Enter String JAVA
The middle character in the string:V
 */
