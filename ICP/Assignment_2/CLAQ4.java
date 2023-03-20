/*Write a java program that takes a double value t from the command line and 
 * prints the value of cos (5t) + sin (7t). Use Math.cos() and math.sin()*/
public class CLAQ4 {

	public static void main(String[] args) {
		double t=Double.parseDouble(args[0]);
		double s=Math.cos(5*t)+Math.sin(7*t);
		System.out.println("cos (5t) + sin (7t)="+s);

	}

}
/*OUTPUT-
javac CLAQ4.java
java CLAQ4 1
cos (5t) + sin (7t)=0.9406487841820153
*/