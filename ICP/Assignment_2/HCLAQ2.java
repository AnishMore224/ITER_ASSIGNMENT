/*The surface area of a cylinder can be defined as A= πr 2 +2πrh, where r 
 * and h are the radius height of the cylinder respectively. Write a java 
 * program to find the area where r and h are inputted from command line 
 * argument. Hint: Use Math.PI.*/
public class HCLAQ2 {

	public static void main(String[] args) {
		double r=Double.parseDouble(args[0]);
		double h=Double.parseDouble(args[1]);
		double a=Math.PI*r*r+2*Math.PI*r*h;
		System.out.println("Area= "+a);
	}

}
/*OUTPUT-
javac HCLAQ2.java
java HCLAQ2 
Area= 9.42477796076938
*/