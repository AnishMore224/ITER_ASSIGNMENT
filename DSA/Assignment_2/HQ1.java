/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-A sales person is paid commission based on the sales he makes as shown by the following
table:
Write a class, Commission, which has:
 An instance variable, sales; an appropriate constructor; and a method, getCommission()
that returns the commission.
Now write a Demo class in Java to test the Commission class by reading a sale from the
user, using it to create a Commission object after validating that the value is not negative.
Finally, call the getcommission() method to get and print the commission.
If the sales are negative, your Demo class should print the message “Invalid Input”.*/
import java.util.Scanner;
class Commission
{
	int sales;
	Commission(int sales)
	{
		this.sales=sales;
	}
	double getCommission()
	{
		if(sales<500)
			return 0.02*sales;
		else if(sales<5000)
			return 0.05*sales;
		return 0.08*sales;
	}
}
class Demo
{
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter sales:");
		int sales=sc.nextInt();
		if(sales<0)
			System.out.println("Invalid Input");
		else
		{
			Commission obj=new Commission(sales);
			double com=obj.getCommission();
			System.out.println("Commission:"+com);
		}
	}
}
public class HQ1
{
	public static void main(String[] args) 
	{
		Demo obj=new Demo();
		obj.display();
	}
}
/*Output---
Enter sales:500
Commission:25.0
*/