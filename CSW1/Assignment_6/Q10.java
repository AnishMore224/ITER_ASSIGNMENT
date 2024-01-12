
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a Java program that reads two float numbers and checks whether the
difference between these two numbers is less than ϵ (ϵ < 1).
 */
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1:");
		float num1 = sc.nextFloat();
		System.out.print("Enter num2:");
		float num2 = sc.nextFloat();
		if (Math.abs(num2 - num1) < 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
/*
 * Output--
 * Enter num1:5.3
 * Enter num2:5.9
 * Yes
 * 
 * 
 * Enter num1:11.9
 * Enter num2:9.9
 * No
 */