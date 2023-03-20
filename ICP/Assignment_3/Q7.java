/* Name- Anish more
 Registration no.=2241013365
 name of the program:From the above question no. (6) write a java program with a 
 choice if the consumer wants to pay bill online. Consumer who pays their 
 electricity bill online will get a discount of 3%.
Here is the sample output:
No. of units consumed: 867
Do you want to pay online(y/n): y
Total amount: 4925.4
Discount: 147.762
Amount payable: 4777.638*/
import java.util.Scanner;
public class Q7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("No. of units consumed:");
		int u=sc.nextInt();
		System.out.println("Do you want to pay online(y/n):");
		char ch=sc.next().charAt(0);
		double p=0,d=0;
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
		
		System.out.println("Total amount:"+p);
		if(ch=='y')
		{
			d=p*0.03;
			System.out.println("Discount:"+d);
		}
		System.out.println("Amount payable:"+(p-d));
	}
}

/*output--
No. of units consumed:
867
Do you want to pay online(y/n):
y
Total amount:4925.4
Discount:147.76199999999997
Amount payable:4777.638
*/