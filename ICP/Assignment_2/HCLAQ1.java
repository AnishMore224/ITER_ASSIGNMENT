/*Write a java program to take three inputs from command line argument as 
 * principle, rate and time. Find Simple interest.*/
public class HCLAQ1 {

	public static void main(String[] args) {
		double p=Double.parseDouble(args[0]);
		double r=Double.parseDouble(args[1]);
		double t=Double.parseDouble(args[2]);
		double s=(p*r*t)/100.0;
		System.out.println("simple interest= "+s);
	}

}
/*OUTPUT-
javac HCLAQ1.java
java HCLAQ1 
simple interest= 200.0
*/