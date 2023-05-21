/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Create a class Bank with instance variables account_no, name, and balance of the customer.
If the input balance is less than or equal to zero then create an Exception called “Invalid BalanceException” and 
throw it using Java. Display the custom message “Balance cannot be less than 0”.*/
import java.util.Scanner;
class Bank{
	int account_no;
	String name;
	double balance;
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		name=sc.next();
		System.out.print("Enter Account number: ");
		account_no=sc.nextInt();
		System.out.print("Enter balance: ");
		try {
			balance=sc.nextDouble();
			if(balance<0)
				throw new InvalidBalanceException("Balance cannot be less than 0");
		}
		catch (InvalidBalanceException e) {
		System.out.println(e);
		}
	}
	void display() {
		System.out.println("Details of the Account Holder:\nName: "+name+"\nAccount number: "+account_no+"\nBalance: "+balance);
	}
	void withdraw(double w) throws InvalidBalanceException {
		balance-=w;
		if(balance<0)
			throw new InvalidBalanceException("Balance cannot be less than 0");
		System.out.println("After withdraw, Balance = "+balance);
	}
}
class InvalidBalanceException extends Exception{
	InvalidBalanceException(String s)
	{
		super(s);
	}
}
public class HQ1 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Bank obj=new Bank();
		obj.set();
		obj.display();
		System.out.print("Enter the money to withdraw: ");
		try {
		obj.withdraw(sc.nextDouble());
		}
		catch(InvalidBalanceException e)
		{
			System.out.println(e);
		}
	}
}
/*Output---
Sample run-1:
Enter name: Anish
Enter Account number: 101
Enter balance: 700
Details of the Account Holder:
Name: Anish
Account number: 101
Balance: 700.0
Enter the money to withdraw: 300
After withdraw, Balance = 400.0


Sample run-2:
Enter name: Anish
Enter Account number: 101
Enter balance: 700
Details of the Account Holder:
Name: Anish
Account number: 101
Balance: 700.0
Enter the money to withdraw: 900
InvalidBalanceException: Balance cannot be less than 0
*/