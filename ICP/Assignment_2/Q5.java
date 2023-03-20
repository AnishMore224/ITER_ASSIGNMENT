/*Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program that reads the radius of a hemisphere and computes the surface area
 and volume using the following formulas:
	 Surface Area of Hemisphere = 3 π r 2 . Volume of a hemisphere = (2/3)πr 3
	 Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the
	 hemisphere. Hint: Use Math.PI.*/
import java.util.Scanner;
public class Q5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the hemisphere: ");
		double r=sc.nextDouble();
		double s=3*Math.PI*r*r;
		double v=(2.0/3)*Math.PI*Math.pow(r, 3);
		System.out.println("The surface area of the hemisphere is "+s);
		System.out.println("The volume area of the hemisphere is "+v);
	}
}
/*Output---
 *Enter the radius of the hemisphere: 
7.0
The surface area of the hemisphere is 461.8141200776996
The volume area of the hemisphere is 718.3775201208659
*/
