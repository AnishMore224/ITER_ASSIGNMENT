
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a java program to copmute x × y without arithmetic operators
 */
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x:");
		int x = sc.nextInt();
		System.out.print("Enter y:");
		int y = sc.nextInt();
		int result = 0;
		int b1;
		for (int i = 1; i <= x; i++) {
			b1 = y;
			while (b1 != 0) {
				int carry = (result & b1) << 1;
				result = result ^ b1;
				b1 = carry;
			}
		}
		System.out.println(x + "x" + y + "=" + result);
	}
}
/*
 * Output--
 * Enter x:5
 * Enter y:6
 * 5x6=30
 * 
 * 
 * Enter x:10
 * Enter y:24
 * 10x24=240
 */