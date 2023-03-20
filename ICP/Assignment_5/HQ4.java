/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program to evaluate the function cos(x) as defined by the infinite series expansion.
The acceptable error for computation is 10 -6 .
*/	
import java.util.Scanner;
public class HQ4
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter x:");
		double x=sc.nextDouble();
		double term=1;
		double sum=1;
		int i=0;
		double error=0.000001;
		while(Math.abs(term)>error)
		{
			i+=2;
			term=(-term)*((x*x)/(i*(i-1)));
			sum+=term;
		}
		System.out.println(sum);
	}
}

/*output
enter x:1
0.540302303791887
*/