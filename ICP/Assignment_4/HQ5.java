/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program to print the following output using loop. Where, input is the number of
rows in output pattern. 
For input, N = 4.
1
121
1213121
121312141213121.
*/	
import java.util.Scanner;
public class HQ5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("For input, N =");
		int n=sc.nextInt();
		String s="";
		for(int i=1;i<=n;i++)
		{
			s=s+i+s;
			System.out.println(s);
		}
	}

}
/*output
For input, N =
4
1
121
1213121
121312141213121
*/
