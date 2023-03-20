/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program to take an integer input from the user and print the input by removing all
zeros.
*/
/*import java.util.Scanner;
public class q9

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n=sc.nextInt();
		int temp=n;
		int rev=0,rev1=0;
		while(temp!=0)
		{
			int b=temp%10;
			if(b!=0)
				rev=rev*10+b;
			temp/=10;
		}
		while(rev!=0)
		{
			int b=rev%10;
			rev1=rev1*10+b;
			rev/=10;
		}
		
		System.out.println("After removing 0 from number "+n+", the new number is "+rev1);
		
	}
}
	*/	
/*output--
Enter an integer number:
10230400
After removing 0 from number 10230400, the new number is 1234

 */
import java.util.Scanner;
public class Q9

{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n=sc.nextInt();
		int temp=n;
		int rev=0,p=0;
		while(temp!=0)
		{
			int b=temp%10;
			if(b!=0) {
				rev=rev+(b*(int)Math.pow(10,p));
				p++;}
			temp/=10;
		}
		
		System.out.println("After removing 0 from number "+n+", the new number is "+rev);
		
	}
	}



