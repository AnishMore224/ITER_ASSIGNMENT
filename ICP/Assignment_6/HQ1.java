/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a program to find the first non-repeated character in a given String, for example, 
  if the given String is "Java" then the first non-repeated character is "J"..*/
import java.util.Scanner;
public class HQ1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String ");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int c=0;
			for(int j=i+1;j<s.length();j++)
			{
				char ch1=s.charAt(j);
				if(ch1==ch) {
					c++;
				break;}
				
			}
			if(c==0) {
				System.out.println(ch);
				break;}
		}
	
	}
}
	
/*Output
Enter String java
j
 */
