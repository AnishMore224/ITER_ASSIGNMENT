/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Define a base class Person with instance variable name, age. The instance variables are
initialized through constructors. The prototype of constructor is as below.
Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance variables
are initialized through constructors. The prototype of constructor is as below.
Employee (string, int, int, double). Another instance method of Employee class is empDisplay()
to display the information of employee details.*/
import java.util.Scanner;
class Person
{
	String name;
	int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
}
class Employee extends Person
{
	int Eid;
	double salary;
	Employee (String name, int age, int Eid, double salary)
	{
		super(name,age);
		this.Eid=Eid;
		this.salary=salary;
	}
	void empDisplay()
	{
		System.out.println("Name\tAge\tEid\tSalary");
		System.out.println(name+"\t"+age+"\t"+Eid+"\t"+salary);
	}
}
public class Q7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name:");
		String name=sc.next();
		System.out.print("Enter age:");
		int age=sc.nextInt();
		System.out.print("Enter Eid:");
		int Eid=sc.nextInt();
		System.out.print("Enter Salary:");
		double salary=sc.nextDouble();
		Employee obj=new Employee(name,age,Eid,salary);
		obj.empDisplay();
	}
}
/*Output---
Enter Name:Anish
Enter age:19
Enter Eid:101
Enter Salary:900000
Name	Age	Eid	Salary
Anish	19	101	900000.0
*/