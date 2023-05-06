/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display
name of a person, count the no. of characters present in the name of the person.*/
import java.util.Scanner;

interface DetailInfo{
	void display();
	void count();
	
}

class person implements DetailInfo
{
	int maxcount=0;
	String name;
	
	person(String name){
		this.name=name;
	}
	public void display() {
		System.out.println("Name\t\tNo. of Characters");
		System.out.println(name+"\t"+maxcount);
	}
	public void count()
	{
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!=' ')
			{
				maxcount++;
			}
		}
	}
}
public class Q8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Name:");
		String name=sc.nextLine();
		person obj=new person(name);
		obj.count();
		obj.display();
	}
}

/*output--
Enter Name:Anish More
Name			No. of Characters
Anish More		9
*/
