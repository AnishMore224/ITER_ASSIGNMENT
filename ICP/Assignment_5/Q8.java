/* Name- Anish more
 Registration no.=2241013365
 name of the program:WAP to enter the value of n and display find the following sum of the series:
1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)
*/	
import java.util.Scanner;
public class Q8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		int sum=0,sum1=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			sum1+=sum;
		}
		System.out.println("Sum of the series "+sum1);
	}
}
/*output
Enter n:5
Sum of the series 35
*/