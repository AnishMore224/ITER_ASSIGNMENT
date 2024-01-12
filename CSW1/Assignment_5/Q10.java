
/*
 *Name:Anish More
 Registration number:2241013365
 Name of program:
Write a program to design a simple calculator (only +,-,*,/ operations). The
calculator works as follows:
Input: ”123+345”
Output: Sum=468
 
 */
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input:");
		String s = sc.nextLine();

		String arr[] = s.split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[2]);
		if (arr[1].equals("+")) {
			System.out.println(num1 + num2);
		} else if (arr[1].equals("-")) {
			System.out.println(num1 - num2);
		} else if (arr[1].equals("*")) {
			System.out.println(num1 * num2);
		} else {
			System.out.println(num1 / num2);
		}
		// if(s.indexOf("+")!=-1)
		// {
		// i=s.indexOf("+");
		// n=Integer.parseInt(s.substring(0,i))+Integer.parseInt(s.substring(i+1));
		// System.out.println(n);
		// }
		// else if(s.indexOf("-")!=-1)
		// {
		// i=s.indexOf("-");
		// n=Integer.parseInt(s.substring(0,i))-Integer.parseInt(s.substring(i+1));
		// System.out.println(n);
		// }
		// else if(s.indexOf("*")!=-1)
		// {
		// i=s.indexOf("*");
		// n=Integer.parseInt(s.substring(0,i))*Integer.parseInt(s.substring(i+1));
		// System.out.println(n);
		// }
		// else
		// {
		// i=s.indexOf("/");
		// n=Integer.parseInt(s.substring(0,i))/Integer.parseInt(s.substring(i+1));
		// System.out.println(n);
		// }
	}
}

/*
 * Output--
 * 
 * Enter input:123 + 345
 * 468
 */