/*Name- Anish more
 Registration no.=2241013365
 name of the program:The distance between two cities (in km.) is input through the keyboard. Write a java program
to convert and print this distance in meters, feet, inches and centimetres.
Hint:
1km=1000meter, 1km=3280.8399feet, 1km= 39370.0787 inch,
1km= 100000 centimetre
Here is the sample run:
*/
import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in km= ");
		double d=sc.nextDouble();
		double m=d*1000;
		double f=d*3280.8399;
		double i=d*39370.0787;
		long c=(long) (d*100000);
		System.out.println(d+" km is "+m+" meters");
		System.out.println(d+" km is "+f+" feet");
		System.out.println(d+" km is "+i+" inch");
		System.out.println(d+" km is "+c+" centimetres");
	}
}
/*Output---
Enter the distance in km= 
165
165.0 km is 165000.0 meters
165.0 km is 541338.5835 feet
165.0 km is 6496062.9854999995 inch
165.0 km is 16500000 centimetres
*/