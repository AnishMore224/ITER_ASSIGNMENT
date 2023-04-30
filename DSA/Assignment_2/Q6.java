/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
java program to display area of different shapes.*/
import java.util.Scanner;
abstract class Shape
{
	abstract void findArea();
	
}
class Square extends Shape
{
	int a;
	Square(int a)
	{
		this.a=a;
	}
	void findArea()
	{
		System.out.println("Area of the Square is:"+(a*a));
	}
}
class Triangle extends Shape
{
	int a;
	int b;
	Triangle(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void findArea()
	{
		System.out.println("Area of the Triangle is:"+(0.5*a*b));
	}
}
class Circle extends Shape
{
	int a;
	Circle(int a)
	{
		this.a=a;
	}
	void findArea()
	{
		System.out.println("Area of the Circle is:"+(Math.PI*a*a));
	}
}

public class Q6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a:");
		int a=sc.nextInt();
		System.out.print("Enter b:");
		int b=sc.nextInt();
		Square obj1=new Square(a);
		Triangle obj2=new Triangle(a,b);
		Circle obj3=new Circle(a);
		obj1.findArea();
		obj2.findArea();
		obj3.findArea();
	}
}
/*Output---
Enter a:3
Enter b:4
Area of the Square is:9
Area of the Triangle is:6.0
Area of the Circle is:28.274333882308138
*/