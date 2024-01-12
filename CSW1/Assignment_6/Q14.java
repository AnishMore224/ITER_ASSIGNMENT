
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a Java program to check whether a number is prime or not.
 */
import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        boolean b = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                b = false;
                break;
            }
        }
        if (b)
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");
    }
}
/*
 * Output--
 * Enter n:7
 * 7 is prime
 * 
 * 
 */
