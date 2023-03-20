/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write java method called count accepts a string as input and returns the number of vowels in
it. The method header is given below.
public static int count(String str)
For example, count ("Welcome") returns 2.*/
import java.util.Scanner;
public class Q7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String ");
		String s=sc.next();
		System.out.println("No. of vowels= "+count(s));
	}
	public static int count(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				c++;
		}
		return c;
	}
	
}
/*Output
 Enter String welcome
No. of vowels= 3

 */
