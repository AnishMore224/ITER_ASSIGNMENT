
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a program that returns true if the number is even else returns false.
Note: don’t use if else.
 */
import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }

    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
/*
 * Output--
 * Enter n:5
 * false
 * 
 * Enter n:6
 * true
 */
