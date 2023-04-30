/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable
and to display the value of instance variable. Write a program to create the details of 5 students.
Display the information of the students who has secured the highest DSA_Mark.*/
import java.util.Scanner;
class Student
{
	int Roll;
	String Name;
	Double DSA_Mark;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Roll:");
		Roll=sc.nextInt();
		System.out.print("Enter Name:");
		Name=sc.next();
		System.out.print("Enter DSA marks:");
		DSA_Mark=sc.nextDouble();
	}
	void showdata()
	{
		System.out.println(Roll+"\t"+Name+"\t\t"+DSA_Mark);
	}
}
public class Q3
{
	public static void main(String[] args) 
	{
		Student S[]=new Student[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Student "+(i+1)+" data");
			S[i]=new Student();
			S[i].getdata();
		}
		System.out.println("Roll\tName\t\tDSA mark");
		for(int i=0;i<5;i++)
		{
			S[i].showdata();
		}

		double maxmark=S[0].DSA_Mark;
		int index=0;
		for(int i=1;i<5;i++)
		{
			if(S[i].DSA_Mark>maxmark)
			{
				maxmark=S[i].DSA_Mark;
				index=i;
			}
		}
		System.out.println("Student with maximum DSA mark--");
		S[index].showdata();
	}
}
/*Output---
Enter Student 1 data
Enter Roll:1
Enter Name:anish
Enter DSA marks:95
Enter Student 2 data
Enter Roll:2
Enter Name:himanshu
Enter DSA marks:90
Enter Student 3 data
Enter Roll:3
Enter Name:shayan
Enter DSA marks:88
Enter Student 4 data
Enter Roll:4
Enter Name:aditya
Enter DSA marks:90
Enter Student 5 data
Enter Roll:5
Enter Name:ved
Enter DSA marks:85
Roll	Name		DSA mark
1	anish		95.0
2	himanshu	90.0
3	shayan		88.0
4	aditya		90.0
5	ved		85.0
Student with maximum DSA mark--
1	anish	95.0
*/
