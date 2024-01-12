
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a Java program to count the frequency of each digit of a number.
 */
import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int arr[] = new int[10];
        while (n != 0) {
            arr[n % 10]++;
            n /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0)
                System.out.println("Frequency of " + i + " is " + arr[i]);
        }
    }
}
/*
 * Output--
 * Enter n:387883
 * Frequency of 3 is 2
 * Frequency of 7 is 1
 * Frequency of 8 is 3
 */
