
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a Java program to print the prime number in a range.
 */
import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            boolean b1 = true;
            i++;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b1 = false;
                    break;
                }
            }
            if (b1) {
                System.out.print(i + " ");
            }
        }
    }
}
/*
 * Output--
 * Enter a:10
 * Enter b:100
 * 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101
 */
