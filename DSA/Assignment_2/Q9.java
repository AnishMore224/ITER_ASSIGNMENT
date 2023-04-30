/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
instance methods. A derived class Exam is created from the class Student. The derived
class contains mark1, mark2, mark3 as instance variables representing the marks of three
subjects and input_Marks () and display_Result () as instance methods. Create an array of
objects of the Exam class and display the result of 5 students.*/
import java.util.Scanner;
class Student1
{
	int roll_number;
	String name;
	String course;
	void input_Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll number:");
		roll_number=sc.nextInt();
		System.out.print("Enter Name:");
		name=sc.next();
		System.out.print("Enter course:");
		course=sc.next();
	}	
	void display_Student()
	{
		System.out.print(roll_number+"\t\t"+name+"\t\t"+course+"\t");
	}
}
class Exam extends Student1
{
	double mark1;
	double mark2;
	double mark3;
	void input_Marks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter marks:");
		mark1=sc.nextDouble();
		mark2=sc.nextDouble();
		mark3=sc.nextDouble();
	}
	void display_Result()
	{
		double sum=mark1+mark2+mark3;
		System.out.println(sum+"\t"+(sum/3));
	}
}
public class Q9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Exam e[]=new Exam[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Student "+(i+1)+" data");
			e[i]=new Exam();
			e[i].input_Student();
			e[i].input_Marks();
		}
		System.out.println("Roll Number\tName\t\tCourse\tTotal_marks\tAverage");
		for(int i=0;i<5;i++)
		{
			e[i].display_Student();
			e[i].display_Result();
		}
	}
}
/*Output---
Enter Student 1 data
Enter roll number:1
Enter Name:anish
Enter course:cse
Enter marks:90 95 100
Enter Student 2 data
Enter roll number:2
Enter Name:himanshu
Enter course:cse
Enter marks:90 90 95
Enter Student 3 data
Enter roll number:3 
Enter Name:shayan
Enter course:cse
Enter marks:90 90 98
Enter Student 4 data
Enter roll number:4
Enter Name:aditya
Enter course:cse
Enter marks:90 89 90
Enter Student 5 data
Enter roll number:5
Enter Name:ved
Enter course:cse
Enter marks:80 90 90
Roll Number		Name		Course	Total_marks	Average
1				anish		cse		285.0		95.0
2				himanshu	cse		275.0		91.66666666666667
3				shayan		cse		278.0		92.66666666666667
4				aditya		cse		269.0		89.66666666666667
5				ved			cse		260.0		86.66666666666667
*/