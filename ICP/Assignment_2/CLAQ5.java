/*Write a java program that takes three int values from the command line and
 *  prints them in ascending order. Use Math.min() and Math.max().*/
public class CLAQ5 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int n1=Math.min(a, Math.min(b, c));
		int n3=Math.max(a, Math.max(b, c));
		int n2=(a+b+c)-(n1+n3);
		System.out.println(n1+"\t"+n2+"\t"+n3);
		
	}

}
/*OUTPUT-
javac CLAQ5.java
java CLAQ5  4 2 9
2	4	9
*/