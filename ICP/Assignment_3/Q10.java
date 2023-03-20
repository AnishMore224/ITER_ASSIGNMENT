/* Name- Anish more
 Registration no.=2241013365
 name of the program:
A University conducts a 100-mark exam for its student and grades them as follows.
Assigns a grade based on the value of the marks. Write a java program to print the
grade according to the mark secured by the student. [Use switch-case].*/
import java.util.Scanner;
public class Q10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		double m=sc.nextDouble();
		int m1=(int)(m/10);
		switch(m1)
		{
		case 10:
		case 9:
			System.out.println("O");
			break;
		case 8:
			System.out.println("A");
			break;
		case 7:
			System.out.println("B");
			break;
		case 6:
			System.out.println("C");
			break;
		case 5:
			System.out.println("D");
			break;
		case 4:
			System.out.println("E");
			break;
		default:
			System.out.println("F");
			break;
	}
}
}

/*output--
Enter marks
40
E
 */