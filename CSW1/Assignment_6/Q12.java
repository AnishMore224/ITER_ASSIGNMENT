
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a Java program that reads two integer number and create a third number
by taking the first two digits of the first number and the last two digits of the
second number.
 */
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n1:");
		int n1 = sc.nextInt();
		System.out.print("Enter n2:");
		int n2 = sc.nextInt();
		while (n1 > 99) {
			n1 /= 10;
		}
		int n3 = (n1 * 100) + (n2 % 100);
		System.out.println("n3:" + n3);
	}
}
/*
 * Output--
 * Enter n1:45678
 * Enter n2:312
 * n3:4512
 * 
 * 
 * Enter n1:123456
 * Enter n2:7533
 * n3:1233
 */
