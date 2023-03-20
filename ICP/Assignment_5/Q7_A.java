/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a program to print the following outputs using for loops:.
*/	
public class Q7_A 
{
	public static void main(String[] args) 
	{
		for(char i='A';i<='E';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*output
A 
A B 
A B C 
A B C D 
A B C D E 
 

*/