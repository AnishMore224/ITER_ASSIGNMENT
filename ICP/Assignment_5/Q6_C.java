/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a program to print the following outputs using for loops:.
*/	
public class Q6_C 
{
	public static void main(String[] args) 
	{
		int c=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}
}
/*output
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/