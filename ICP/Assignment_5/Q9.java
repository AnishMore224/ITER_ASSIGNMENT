	/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a program that will read the value of n from the user and calculate sum of the following
series:
*/	
import java.util.Scanner;
public class Q9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=(1.0/(i*i));
		}
		System.out.println("Sum of the series "+sum);
	}
}
/*output
Enter n:5
Sum of the series 1.4636111111111112
*/