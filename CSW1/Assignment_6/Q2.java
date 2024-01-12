
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: The parity of a binary word is 1 if the number of 1s in the word is odd; otherwise,
it is 0. Write a Java program to count the parity of an integer number.
 */
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int count = 0;
		while (n != 0) {
			count = count ^ (n & 1);
			n = n >> 1;
		}
		System.out.println("Parity:" + count);
	}
}

/*
 * Output--
 * Enter number:5
 * Parity:0
 * 
 * 
 * Enter number:11
 * Parity:1
 */
