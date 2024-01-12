/*
 * Name:Anish More
 * Registration Number: 2241013365
 * Name of program: Write a Java program to count the number of bits that are set to 1 in an integer.	
 */
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int n=sc.nextInt();
		int count=0;
		while(n!=0)
		{
			count+=n&1;
			n=n>>1;
		}
		System.out.println("No. of 1 bit:"+count);
	}
}

/*Output--
Enter number:5
No. of 1 bit:2


Enter number:11
No. of 1 bit:3
*/
