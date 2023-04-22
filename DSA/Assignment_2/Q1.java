/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-A phone number can be thought of as having three parts: the area code, the exchange code and
the number.
Example: A phone number, such as (212) 767-8900, can be thought of as having three parts:
the area code (212), the exchange (767) and the number (8900).
Define a class Phone to store these three parts of a phone number separately as instance
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.)
operator and instance variable with value area_code: 212, exchange: 767,
number: 8900), and initialize other from the user through member method input ( ). Display
both the numbers.*/
import java.util.Scanner;
class Phone 
{
	int area_code;
	int exchange;
	int number;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter area code:");
		area_code=sc.nextInt();
		System.out.print("Enter exchange:");
		exchange=sc.nextInt();
		System.out.print("Enter number:");
		number=sc.nextInt();
	}
	void display()
	{
		System.out.println("("+area_code+") "+exchange+"-"+number);
	}
}
public class Q1
{
	public static void main(String[] args) 
	{
		Phone myobj=new Phone();
		Phone userobj=new Phone();
		myobj.area_code=212;
		myobj.exchange=767;
		myobj.number=8900;
		userobj.input();
		System.out.print("My number is ");
		myobj.display();
		System.out.print("Your number is ");
		userobj.display();
	}
}
/*Output---
Enter area code:415
Enter exchange:555
Enter number:1212
My number is (212) 767-8900
Your number is (415) 555-1212
*/