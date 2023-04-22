/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-A phone number can be thought of as having three parts: the area code, the exchange code and
the number.
Example: Define a class called Complex with instance variables real, imag and instance methods
setData(), display(), add(). Write a Java program to add two complex numbers.
The prototype of add method is:
public Complex add(Complex, Complex).*/
import java.util.Scanner;
class Complex
{
	double real;
	double imag;
	
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter real part:");
		real=sc.nextDouble();
		System.out.print("Enter imaginary part:");
		imag=sc.nextDouble();
	}
	void display()
	{
		System.out.println(real+"+i"+imag);
	}
	Complex add(Complex C1,Complex C2)
	{
		real=C1.real+C2.real;
		imag=C1.imag+C2.imag;
		return this;
	}
}
public class Q2
{
	public static void main(String[] args) 
	{
		Complex C1=new Complex();
		Complex C2=new Complex();
		System.out.println("First complex number ");
		C1.setData();
		C1.display();
		System.out.println("Second complex number ");
		C2.setData();
		C2.display();
		Complex C3=new Complex();
		C3=C3.add(C1, C2);
		System.out.println("After adding ----");
		C3.display();
	}
}
/*Output---
First complex number 
Enter real part:2
Enter imaginary part:3
2.0+i3.0
Second complex number 
Enter real part:3
Enter imaginary part:4
3.0+i4.0
After adding ----
5.0+i7.0
*/