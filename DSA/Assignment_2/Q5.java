/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Define a class Deposit. The instance variable of the class Deposit are mentioned below.
 Initialize the instance variables Principal, Time, rate through constructors. Constructors are
overloaded with the following prototypes.
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are (i) display ( ): to display the
value of instance variables, (ii) calc_amt( ) to calculate the total amount.
Total_amt = Principal + (Principal×rate×Time)/100;*/
import java.util.Scanner;
class Deposit
{
	long Principal;
	int Time;
	double Rate;
	double Total_amt;
	Deposit()
	{
		Principal=0L;
		Time=0;
		Rate=0.0;
	}
	Deposit(long p,int t,double r)
	{
		Principal=p;
		Time=t;
		Rate=r;
	}
	Deposit(long p,int t)
	{
		Principal=p;
		Time=t;
	}
	Deposit(long p,double r)
	{
		Principal=p;
		Rate=r;
	}
	void display()
	{
		System.out.print(Principal+"\t\t"+Time+"\t"+Rate+"\t");
	}
	void calc_amt( )
	{
		Total_amt = Principal + (Principal*Rate*Time/100);
		System.out.println(Total_amt);
	}
}
public class Q5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principal:");
		long p=sc.nextLong();
		System.out.print("Enter Time:");
		int t=sc.nextInt();
		System.out.print("Enter Rate:");
		double r=sc.nextDouble();
		System.out.println("Principal\tTime\tRate\tTotal Amount");
		Deposit obj1=new Deposit();
		obj1.display();
		obj1.calc_amt();
		Deposit obj2=new Deposit(p,t,r);
		obj2.display();
		obj2.calc_amt();
		Deposit obj3=new Deposit(p,t);
		obj3.display();
		obj3.calc_amt();
		Deposit obj4=new Deposit(p,r);
		obj4.display();
		obj4.calc_amt();
	}
}
/*Output---
Enter Principal:100
Enter Time:2
Enter Rate:10
Principal	Time	Rate	Total Amount
0		0	0.0	0.0
100		2	10.0	120.0
100		2	0.0	100.0
100		0	10.0	100.0
*/
