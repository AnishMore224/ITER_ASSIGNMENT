/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program that takes the x – y coordinates of a 
 point in the Cartesian plane and prints a message telling either an axis on 
 which the point lies or the quadrant in which it is found.
Here is the sample output:
(-1.0, -2.5) is in quadrant III
(0.0, 4.8) is on the y-axis*/
import java.util.Scanner;
public class Q8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x-coordinate");
		double x=sc.nextDouble();
		System.out.println("Enter y-coordinate");
		double y=sc.nextDouble();
		if(x>0&&y>0)
		{
			System.out.println("("+x+","+y+")is in quadrant I");
		}
		else if(x<0&&y>0)
		{
			System.out.println("("+x+","+y+")is in quadrant II");
		}
		else if (x<0&&y<0)
		{
			System.out.println("("+x+","+y+")is in quadrant III");
		}
		else if(x>0&&y<0)
		{
			System.out.println("("+x+","+y+")is in quadrant IV");
		}
		else if(x==0.0&&y==0.0)
		{
			System.out.println("("+x+","+y+")is on origin");
		}
		else if(x==0.0)
		{
			System.out.println("("+x+","+y+")is on the y-axis");
		}
		else
		{
			System.out.println("("+x+","+y+")is on the x-axis");
		}
	}
}

/*output--
 Enter x-coordinate
0.0
Enter y-coordinate
4.8
(0.0,4.8)is on the y-axis
 */