/*Write a java program that takes two int values from the command line as dividend and divisor
and print the quotient and remainder .*/
public class CLAQ1 
{
	public static void main(String[] args)
	 {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("Quotient= "+(a/b));
		System.out.println("Remainder= "+(a%b));
	}

}
/*OUTPUT-
javac CLAQ1.java
java CLAQ1  3 2
Quotient= 1
Remainder= 1
*/