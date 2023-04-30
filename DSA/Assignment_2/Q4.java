/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Define a class called product. Two instance variables of the class are pid (product-id) and
price (product price). It consists of one static variable tot_price (total price). Initialize the value
of instance variables through parameterized constructor. It consists of a display ( ) method to
display the value of instance variables. A person went to market and purchase 5 different
products. Using the above mentioned class, display the details of products that the person has
purchased. Also, determine how much total amount the person will pay for the purchase of 5
products.*/
import java.util.Scanner;
class product
{
	int pid;
	double price;
	static double tot_price=0;
	product(int pd,double p)
	{
		pid=pd;
		price=p;
	}
	void display()
	{
		System.out.println(pid+"\t\t"+price);
	}
}
public class Q4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		product P[]=new product[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Product "+(i+1)+" data");
			System.out.print("Enter product id:");
			int pd=sc.nextInt();
			System.out.print("Enter Price:");
			double p=sc.nextDouble();
			P[i]=new product(pd,p);
		}
		System.out.println("Product-id\tproduct price");
		for(int i=0;i<5;i++)
		{
			P[i].display();
			product.tot_price+=P[i].price;
		}
		System.out.println("Total amount:"+product.tot_price);
	}
}
/*Output---
Enter Product 1 data
Enter product id:1
Enter Price:100
Enter Product 2 data
Enter product id:2
Enter Price:200
Enter Product 3 data
Enter product id:3
Enter Price:300
Enter Product 4 data
Enter product id:4
Enter Price:400
Enter Product 5 data
Enter product id:5
Enter Price:500
Product-id	product price
1			100.0
2			200.0
3			300.0
4			400.0
5			500.0
Total amount:1500.0
*/
