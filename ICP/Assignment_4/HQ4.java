/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program to print the sum of all even numbers and the product of all odd numbers
from 1 to N. Where, N is the input to the program .
*/	
import java.util.Scanner;
public class HQ4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("For input, N =");
		int n=sc.nextInt();
		int e=0,o=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				e=e+i;
			else
				o=o*i;
		}
		System.out.println("Sum of all even numbers ="+e);
		System.out.println("Product of all odd numbers ="+o);
	}

}
/*output
 * For input, N =
5
Sum of all even numbers =6
Product of all odd numbers =9
*/
