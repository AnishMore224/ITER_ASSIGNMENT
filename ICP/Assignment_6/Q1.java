/*Name-Anish More
  Registration number:2241013365
  Name of the program:Design a Simple Calculator using methods in java containing the following functionalities,
namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The
signature of the methods are given below.
 public static int additionSimple(int x, int y)
 Two inputs, x and y. Return the result of adding x to y.
 public static int subtractionSimple(int x, int y)
 Two inputs, x and y. Return the result of subtracting x from y i.e y-x.
 public static int multiplicationSimple(int x, int y)
 Two inputs, x and y. Return the result of multiplying x to y i.e. x*y.
 public static double divisionSimple(int x, int y)
 Two inputs, x and y. Return the result of dividing y by x. Please check whether
x is zero before dividing.
 public static int remainderSimple(int n, int m)
 Please make sure that remainderSimple() takes two inputs, namely, a number
(int) n and a number (int) m. The method should return the remainder of n
divided by m.
 public static double squareRootSimple(int n)
 Takes one input, namely a number n, and returns the square root of the number.
The return should be double. Please kindly make sure that the number n is
positive.
  */
import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x:");
		int x=sc.nextInt();
		System.out.print("Enter y:");
		int y=sc.nextInt();
		System.out.println("Addition="+additionSimple(x,y));
		System.out.println("Subtraction="+subtractionSimple(x,y));
		System.out.println("Multiplication="+multiplicationSimple(x,y));
		System.out.println("Division="+divisionSimple(x,y));
		System.out.println("Remainder="+remainderSimple(x,y));
		System.out.println("Square root"+squareRootSimple(x));

	}
	public static int additionSimple(int x, int y) 
	{
		return x+y;
	}
	public static int subtractionSimple(int x, int y)
	{
		return y-x;
	}
	public static int multiplicationSimple(int x, int y)
	{
		return x*y;
	}
	public static double divisionSimple(int x, int y)
	{
		if(x!=0) 
			return (double)y/x;
		System.out.println("Not valid");
		return 0;
	}
	public static int remainderSimple(int n, int m)
	{
		return n%m;
	}
	public static double squareRootSimple(int n)
	{
		return Math.sqrt(n);
	}
	
}
/*Output
 * Enter x:4
Enter y:3
Addition=7
Subtraction=-1
Multiplication=12
Division=0.75
Remainder=1
Square root2.0

 */
