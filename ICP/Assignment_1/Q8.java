/*Name- Anish more
 Registration no.=2241013365
 name of the program:program to swap x and y
 */
public class Q8 {

	public static void main(String[] args) {
		int x=10,y=20;
		System.out.println("Before swapping, X="+x+" Y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping, X="+x+" Y="+y);

	}
}

/*Output---
Before swapping, X=10 Y=20
After swapping, X=20 Y=10
*/