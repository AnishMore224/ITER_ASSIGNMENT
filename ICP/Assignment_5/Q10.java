/* Name- Anish more
 Registration no.=2241013365
 name of the program:Given a=0, b=1 and c=1 are the first three numbers of some sequence. All other numbers in
the sequence are generated from the sum of their three most recent predecessors. Write a java
program to generate this sequence up to n terms where n > 3
*/	
import java.util.Scanner;
public class Q10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		int a=0,b=1,c=1;
		int d=0;
		System.out.print(a+" "+b+" "+c);
		for(int i=4;i<=n;i++)
		{
			d=a+b+c;
			System.out.print(" "+d);
			a=b;
			b=c;
			c=d;
		}
	}
}
/*output
Enter n:10
0 1 1 2 4 7 13 24 44 81
*/