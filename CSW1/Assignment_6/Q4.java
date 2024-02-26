
/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a program that takes a 64-bit word and returns the 64-bit word consisting
of the bits of the input word in reverse order. For example, if the input is
alternating 1s and 0s, i.e., (1010...10), the output should be alternating 0s and
1s, i.e.,(0101...01).
 */
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		long n = 6;
		System.out.println(Long.toBinaryString(n));
		long result = 0;
		// 32 bit
		for (int i = 0; i <64; i++) {
			long bit = (n >> i) & 1;
			result |= bit << (63 - i);

		}
		System.out.println(Long.toBinaryString(result));
	}
}



/*
 * Output--
 * Enter word:11001010
 * 01010011
 * 
 * 
 * Enter word:10101011
 * 11010101
 */