
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a program to swap the ith bit with jth bit of a number.
 */
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = sc.nextInt();
		System.out.print("Enter i:");
		int i = sc.nextInt();
		System.out.print("Enter j:");
		int j = sc.nextInt();
		int bitmask;
		if (((n >> i) & 1) != ((n >> j) & 1)) {
			bitmask = (1 << i) | (1 << j);
			n = n ^ bitmask;
		}
		System.out.println(n);
	}
}

/*
 * Output--
 * Enter number:4
 * Enter i:0
 * Enter j:2
 * 1
 * 
 * 
 * Enter number:10
 * Enter i:1
 * Enter j:2
 * 12
 */