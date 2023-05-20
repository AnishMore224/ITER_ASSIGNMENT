/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Create a class Student having two instance variable name and mark. Enter mark, name of the student.
 If mark is more than 100, create exception MarksOutOfBoundException & throw it using Java. 
 Display the customised message Mark can’t be greater than 100 for the exception..*/
import java.util.Scanner;
class Student{
	String name;
	double mark;
	void setdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of the student: ");
		name=sc.next();
		System.out.print("Enter marks: ");
		mark=sc.nextDouble();
	}
	void display()throws MarksOutOfBoundException {
		if(mark>100) {
			throw new MarksOutOfBoundException("Mark can't be greater than 100");
		}
		System.out.println(name+" has got "+mark);
	}
}


class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException(String e)
	{
		super(e);
	}
}


public class Q3
{
	public static void main(String[] args) 
	{
		Student obj=new Student();
		try {
		obj.setdata();
		obj.display();
		}
		catch(MarksOutOfBoundException e)
		{
			System.out.println(e);
		}
	}
}
/*Output---
Sample run-1:
Enter the name of the student: Ramesh
Enter marks: 98
Ramesh has got 98.0

Sample run-2:
Enter the name of the student: Raju
Enter marks: 130
MarksOutOfBoundException: Mark can't be greater than 100
*/