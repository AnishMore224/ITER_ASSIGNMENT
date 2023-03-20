/* Name- Anish more
 Registration no.=2241013365
 name of the program:
Write a java program that prompts the user to enter an integer for today’s day of the
week (Sunday is 0, Monday is 1... and Saturday is 6). Also prompt the user to enter
the number of days after today for a future day and display the future day of the week.
Here is a sample run:
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday
Enter today's day: 0 Enter the number of days elapsed
since today: 31
Today is Sunday and the future day is Wednesday*/
import java.util.Scanner;
public class HQ2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter today's day:");
		int t=sc.nextInt();
		System.out.println("Enter the number of days elapsed since today:");
		int e=sc.nextInt();
		int e1=(e+t)%7;
		String td="";
		String fd="";
		switch(t)
		{
		case 0:
			td="Sunday";
			break;
		case 1:
			td="Monday";
			break;
		case 2:
			td="Tuesday";
			break;
		case 3:
			td="Wednesday";
			break;
		case 4:
			td="Thursday";
			break;
		case 5:
			td="Friday";
			break;
		case 6:
			td="Saturday";
			break;
		}
		switch(e1)
		{
		case 0:
			fd="Sunday";
			break;
		case 1:
			fd="Monday";
			break;
		case 2:
			fd="Tuesday";
			break;
		case 3:
			fd="Wednesday";
			break;
		case 4:
			fd="Thursday";
			break;
		case 5:
			fd="Friday";
			break;
		case 6:
			fd="Saturday";
			break;
		}
		System.out.println("Today is "+td+" and the future day is "+fd);
	}

}
/*output--
Enter today's day:
0
Enter the number of days elapsed since today:
31
Today is Sunday and the future day is Wednesday

 */