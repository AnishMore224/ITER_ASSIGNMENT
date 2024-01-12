
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a Java program that reads an integer number and counts the number of
digits that are even.
 */
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n:");
		int n = sc.nextInt();
		int count = 0;
		while (n != 0) {
			if ((n % 10) % 2 == 0)
				count++;
			n /= 10;
		}
		System.out.println("Number of even digits:" + count);
	}
}
/*
 * Output--
 * Enter n:123456
 * Number of even digits:3
 * 
 * 
 * Enter n:123456789
 * Number of even digits:4
 */
