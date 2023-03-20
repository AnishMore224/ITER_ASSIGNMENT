/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a java program to calculate the area of triangle, square, circle, rectangle by using method
overloading.*/
import java.util.Scanner;
public class Q10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base of triangle ");
		int b=sc.nextInt();
		System.out.print("Enter height of triangle ");
		int h=sc.nextInt();
		System.out.print("Enter side of square ");
		int s=sc.nextInt();
		System.out.print("Enter radius of circle ");
		double r=sc.nextDouble();
		System.out.print("Enter length of rectangle ");
		double l=sc.nextDouble();
		System.out.print("Enter width of rectangle ");
		double w=sc.nextDouble();
		area(b,h);
		area(s);
		area(r);
		area(l,w);
	}
	public static void area(int b,int h) 
	{
		System.out.println("Area of triangle="+(0.5*b*h));
	}
	public static void area(int s) 
	{
		System.out.println("Area of square="+(s*s));
	}
	public static void area(double r) 
	{
		System.out.println("Area of circle="+(Math.PI*r*r));
	}
	public static void area(double l, double w) 
	{
		System.out.println("Area of rectangle="+(l*w));
	}
}
	
/*Output
Enter base of triangle 2
Enter height of triangle 3
Enter side of square 4
Enter radius of circle 3
Enter length of rectangle 6
Enter width of rectangle 7
Area of triangle=3.0
Area of square=16
Area of circle=28.274333882308138
Area of rectangle=42.0
 */
