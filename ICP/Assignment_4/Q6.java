/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program to enter two numbers through the keyboard. Write a program to find the
value of one number raised to the power of another. (Do not use Java built-in method).
*/
import java.util.Scanner;
public class Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base: ");
		int b=sc.nextInt();
		System.out.println("Enter the power: ");
		int p=sc.nextInt();
		int result=1;
		for(int i=1;i<=p;i++)
		{
			result=result*b;
		}
		System.out.println(b+" to the power "+p+" is: "+result);
	}
}
		
/*output--
Enter the base: 
5
Enter the power: 
4
5 to the power 4 is: 625
 */