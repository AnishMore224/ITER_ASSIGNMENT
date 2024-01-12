
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a program to print the first 100th prime number.
 */

public class Q15 {

    public static void main(String[] args) {

        int count = 0;
        int i = 1;
        while (count < 100) {
            boolean b = true;
            i++;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                count++;
            }
        }
        System.out.println("100th prime number is " + (i));
    }
}
/*
 * Output--
 * 100th prime number is 541
 */
