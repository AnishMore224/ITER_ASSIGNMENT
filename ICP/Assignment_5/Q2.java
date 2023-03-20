	/* Name- Anish more
 Registration no.=2241013365
 name of the program:WAP to check whether a number is twisted prime or not. Twisted prime is a number if the
number and its reverse both are prime then it is called twisted prime.
*/	
import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		int temp=n;
		int c=0,c1=0,rev=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		while(temp!=0)
		{
			rev=rev*10+(temp%10);
			temp/=10;
			
		}
		for(int i=1;i<=rev;i++)
		{
			if(rev%i==0)
				c1++;
		}
		if(c==2&&c1==2)
			System.out.println(n+" is twisted prime.");
		else
			System.out.println(n+" is not a twisted prime.");
		
	}

}
/*output
Enter a number:97
97 is twisted prime.
*/
