/* Name- Anish more
 Registration no.=2241013365
 name of the program:WAP to enter the first number and second number. Display the prime numbers between the
first and second number.
*/	
import java.util.Scanner;
public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=sc.nextInt();
		System.out.print("Enter the second number:");
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
				System.out.print(i+" ");
		}
	}

}
/*output
Enter the first number:4
Enter the second number:15
5 7 11 13 
*/
