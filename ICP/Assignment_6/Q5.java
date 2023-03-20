/*Name-Anish More
  Registration number:2241013365
  Name of the program:A regular polygon is an n-sided polygon in which all sides are of the same length and all angles
have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for
computing the area of a regular polygon is 
Write a method that returns the area of a regular polygon using the following header:
public static double area(int n, double side)*/
import java.util.Scanner;
public class Q5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of sides");
		int n=sc.nextInt();
		System.out.print("Enter sides");
		int side=sc.nextInt();
		System.out.println("Area= "+area(n,side));
	}
	public static double area(int n, double side) 
	{
		return (n*side*side)/(4*Math.tan(Math.PI/n));
	}
	
}
/*Output
Enter no. of sides4
Enter sides4
Area= 16.000000000000004
 */
