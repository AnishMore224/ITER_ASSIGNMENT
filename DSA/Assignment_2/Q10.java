/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Design a package that contains two classes Student & Test. The Student class has data
members as name, roll and instance methods input ( ) & output ( ). Similarly the Test class
has data members as mark1, mark2 and instance methods input ( ), output ( ), Student is
extended by Test. Another package carry interface Sports with 2 attributes score1, score2.
Find grand total mark & score in another class.*/
import mypack.*;
interface Sports{
	int score1=1;
	int score2=2;
}
public class Q10 implements Sports
{
	public static void main(String[] args) 
	{
		Test obj=new Test();
		obj.input();
		System.out.println("Name\t\troll\tmark1\tmark2");
		obj.output();
		double total=obj.mark1+obj.mark2;
		System.out.println("Total marks:"+total+"\nTotal score:"+(score1+score2));
	}

}



//Student and Test class in different package
package mypack;
import java.util.Scanner;
public class Test extends student{
public double mark1;
public double mark2;
public void input() 
{
	super.input();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter mark1 and mark2:");
	mark1=sc.nextDouble();
	mark2=sc.nextDouble();
}
public void output() {
	super.output();
	System.out.println(mark1+"\t"+mark2);
	}
}

class student {
	String name;
	int roll;
	public void input() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and roll:");
		name=sc.nextLine();
		roll=sc.nextInt();
	}
	public void output() {
		System.out.print(name+"\t"+roll+"\t");
	}
}


/*output--
Enter name and roll:
Anish More
12
Enter mark1 and mark2:
95
96
Name		roll	mark1	mark2
Anish More	12		95.0	96.0
Total marks:191.0
Total score:3
*/
