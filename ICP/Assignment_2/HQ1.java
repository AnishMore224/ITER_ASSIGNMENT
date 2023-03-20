/*Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program that displays the following table. Cast floating-point 
 numbers into integers.*/

/*import java.util.Scanner;
public class hq1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		double m=sc.nextDouble();
		double y=m/(365*24*60);
		double d=(y-(int)y)*365;
		System.out.println((int)m+" minutes is approximately "+(int)y+" years and "+(int)d+" days");
		
	
	}
}

*/
import java.util.Scanner;
public class HQ1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int m=sc.nextInt();
		int y=m/(365*24*60);
		int d=(m%(365*60*24))/(24*60);
		System.out.println(m+" minutes is approximately "+y+" years and "+d+" days");
		
	}
}
/*Output---
Enter the number of minutes: 
100000000
100000000 minutes is approximately 190 years and 94 days
*/