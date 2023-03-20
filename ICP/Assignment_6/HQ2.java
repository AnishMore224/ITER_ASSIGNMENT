/*Name-Anish More
  Registration number:2241013365
  Name of the program:
Write a java program to calculate the volume of sphere, cuboid and cube by using method overloading.
Volume of a cube = s * s * s [s: Side of the cube]
Volume of a Sphere = 43 × π × r3 [r: radius]
Volume of a cuboid = L × b × h [L: Length, b: Breadth, h: Height].*/
import java.util.Scanner;
public class HQ2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter side of cube ");
		int s=sc.nextInt();
		System.out.print("Enter radius of sphere ");
		double r=sc.nextDouble();
		System.out.print("Enter length of cuboid ");
		int l=sc.nextInt();
		System.out.print("Enter breadth of cuboid ");
		int b=sc.nextInt();
		System.out.print("Enter height of cuboid ");
		int h=sc.nextInt();
		area(s);
		area(r);
		area(l,b,h);
	}
	public static void area(int s) 
	{
		System.out.println("Volume of a cube="+(s*s*s));
	}
	public static void area(double r) 
	{
		System.out.println("Volume of a Sphere="+(4.0/3*Math.PI*r*r*r));
	}
	public static void area(int l,int b,int h) 
	{
		System.out.println("Volume of a cuboid="+(l*b*h));
	}
}
	
/*Output
Enter side of cube 3
Enter radius of sphere 3
Enter length of cuboid 2
Enter breadth of cuboid 3
Enter height of cuboid 4
Volume of a cube=27
Volume of a Sphere=113.09733552923255
Volume of a cuboid=24

 */
