
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a program to check whether a number is palindrome or not.
 */
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = sc.nextInt();
		int temp = n, rev = 0;
		while (temp != 0) {
			rev = rev * 10 + (temp % 10);
			temp /= 10;
		}
		if (n == rev) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
	}
}
/*
 * Output--
 * Enter number:123
 * Not Pallindrome
 * 
 * 
 * Enter number:121
 * Pallindrome
 */