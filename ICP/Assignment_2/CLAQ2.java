/*Write a java program that takes two positive integers from command-line arguments and
prints the result of first number raise to the power of second number.*/
public class CLAQ2 
{
	public static void main(String[] args)
	 {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println(Math.pow(a,b));
		
	}

}

/*
Output--
javac CLAQ2.java
java CLAQ2  3 2
9.0
*/