/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Define a class called Book with instance variables BName, BEdition, BPrice. Use constructor to
initialize the instance variables of the class. Another instance method display ( ) to display the book
information. A person purchase 5 different books. Display the book details which has the maximum
price.*/
import java.util.Scanner;
class Book
{
	String BName;
	int BEdition;
	double BPrice;
	Book(String BName,int BEdition,double BPrice)
	{
		this.BName=BName;
		this.BEdition=BEdition;
		this.BPrice=BPrice;
	}
	void display()
	{
		System.out.println(BName+"\t"+BEdition+"\t"+BPrice);
	}
}
public class HQ2
{
	public static void main(String[] args) 
	{
		Book b[]=new Book[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Book "+(i+1)+" data");
			String BName=sc.next();
			int BEdition=sc.nextInt();
			double BPrice=sc.nextDouble();
			
			b[i]=new Book(BName,BEdition,BPrice);
		}
		System.out.println("BName\tBEdition\tBPrice");
		for(int i=0;i<5;i++)
		{
			b[i].display();
		}

		double maxPrice=b[0].BPrice;
		int index=0;
		for(int i=1;i<5;i++)
		{
			if(b[i].BPrice>maxPrice)
			{
				maxPrice=b[i].BPrice;
				index=i;
			}
		}
		System.out.println("Book with maximum price--");
		System.out.println("BName\tBEdition\tBPrice");
		b[index].display();
	}
}
/*Output---
Enter Book 1 data
DSA 7 1000
Enter Book 2 data
IGT 6 1090
Enter Book 3 data
PME 3 2000
Enter Book 4 data
CALC 8 3000
Enter Book 5 data
UPEM 5 1500
BName	BEdition	BPrice
DSA		7		1000.0
IGT		6		1090.0
PME		3		2000.0
CALC	8		3000.0
UPEM	5		1500.0
Book with maximum price--
BName	BEdition	BPrice
CALC	8			3000.0

*/