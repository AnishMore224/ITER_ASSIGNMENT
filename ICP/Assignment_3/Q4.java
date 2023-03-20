/* Name- Anish more
 Registration no.=2241013365
 name of the program:Make a simple game involving a computer and a user. 
 The computer first guesses a number between 1 and 9 inclusive, then ask the user
  to enter a number between 1 and 9 inclusive. If the user guess is correct then 
  display “You got it right”, if the guess is close (+1, -1) “Almost got it “, 
  Otherwise “You got it wrong”.
Here are some sample runs.
Enter user number: 2
Computer guesses: 3
“Almost got it”
Enter user number: 4
Computer guesses: 4
“You got it right”
Enter user number: 1
Computer guesses: 5
“You got it wrong”.*/
import java.util.Scanner;
public class Q4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user number: ");
		int a=sc.nextInt();
		int c=(int)(Math.random()*9+1);
		System.out.println("Computer guesses:"+c);
		if(a==c)
		{
			System.out.println("You got it right");
		}
		else if(a-c==1||a-c==-1)
		{
			System.out.println("Almost got it ");
		}
		else
		{
			System.out.println("You got it wrong");
		}
	}
}
/*output--
Enter user number: 
3
Computer guesses:3
You got it right
*/
