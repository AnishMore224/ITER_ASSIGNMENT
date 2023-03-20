/*Write a java program that prints the sum of two random integers between 
 * 1 and 6 (such as you might get when rolling dice)*/
public class CLAQ3 {

	public static void main(String[] args) {
		int lb=Integer.parseInt(args[0]);
		int ub=Integer.parseInt(args[1]);
		int x=lb+(int) (Math.random()*(ub-lb)+lb);
		int y=lb+(int) (Math.random()*(ub-lb)+lb);
		System.out.println(x);
		System.out.println(y);
		System.out.println("Sum="+(x+y));
		
	}

}

/*OUTPUT-
javac CLAQ3.java
java CLAQ3 1 6
Sum=9
*/