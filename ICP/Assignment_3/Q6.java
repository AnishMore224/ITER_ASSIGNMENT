/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program to calculate the monthly electricity
  bill. The tariff is given as follows:*/
import java.util.Scanner;
public class Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of units used:");
		int u=sc.nextInt();
		double p=0;
		if(u<=50)
		{
			p=u*3;
		}
		else if(u<=200)
		{
			p=(50*3)+(u-50)*4.8;
		}
		else if (u<=400)
		{
			p=(50*3)+(150*4.8)+(u-200)*5.8;
		}
		else
		{
			p=(50*3)+(150*4.8)+(200*5.8)+(u-400)*6.2;
		}
		System.out.println("Electricity bill:"+p);
	}
}

/*output--
Enter the number of units used:
150
Electricity bill:630.0
*/