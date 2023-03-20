/*Write a java program to input a four-digit number from command line 
 * argument and find sum of the first and last digit of the number.*/
public class HCLAQ3 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int s=n%10+n/1000;
		System.out.println("sum= "+s);

	}

}
/*OUTPUT-
javac HCLAQ3.java
java HCLAQ3 
sum= 5
*/