/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a Java method that accept three integers and check whether they are consecutive are not. 
  Return true or false. Expected Output: Input the first number: 15 Input the second number: 16 Input the third number: 
  17 Check whether the three said numbers are consecutive or not! true*/
import java.util.Scanner;
public class HQ5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input the first number: ");
		int a=sc.nextInt();
		System.out.print("Input the second number: ");
		int b=sc.nextInt();
		System.out.print("Input the third number: ");
		int c=sc.nextInt();
		System.out.println("Check whether the three said numbers are consecutive or not! "+check(a,b,c));
	}
	public static boolean check(int a,int b,int c)
	{
		return (a+1==b&&b+1==c)||(a-1==b&&b-1==c);
	}
}
/*Output
Input the first number: 15
Input the second number: 16
Input the third number: 17
Check whether the three said numbers are consecutive or not! true
 */
