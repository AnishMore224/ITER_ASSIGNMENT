
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a program to find the reverse of a number.
 */
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt(), rev = 0;
		boolean b = false;
		if (n < 0) {
			n = Math.abs(n);
			b = true;
		}
		while (n != 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		if (b) {
			rev *= -1;
		}
		System.out.println("Reverse number is:" + rev);
	}
}
/*
 * Output--
 * Enter n:123
 * Reverse number is:321
 * 
 * 
 * Enter n:-345
 * Reverse number is:-543
 */
