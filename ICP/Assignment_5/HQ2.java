/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a program to print the following patterns using loops:
  	  *
    * * *
  * * * * *
* * * * * * *
*/	
public class HQ2 
{
	public static void main(String[] args) 
	{
		int m=1;
		for(int i=1;i<=4;i++)
		{
			for(int k=4;k>i;k--)
			{
				System.out.print("  ");
			}
			
			for(int j=1;j<=m;j++)
			{
				System.out.print("* ");
			}
			m+=2;
			System.out.println();
		}
	}
}
/*output
      * 
    * * * 
  * * * * * 
* * * * * * * 

 
*/