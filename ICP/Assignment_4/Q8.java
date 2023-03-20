/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a program that generates a random integer number between 1 to 10 and asks the user to
guess what the number is. If the user's guess is higher than the random number, the program
should display "Too high, try again." If the user's guess is lower than the random number, the
program should display "Too low, try again." The program should use a loop that repeats until
the user correctly guesses the random number and display good guess.
*/
import java.util.Scanner;
public class Q8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		while(b)
		{
			System.out.println("User guess:");
			int u=sc.nextInt();
			int c=(int)(Math.random()*10+1);
			System.out.println("Computer guess: "+c);
			
			if(u>c)
				System.out.println("Too high, try again");
			else if(u<c)
				System.out.println("Too low, try again");
			else
				b=false;
			
		}
		System.out.println("good guess");
		
	}
}
		
/*output--
User guess:
1
Computer guess: 8
Too low, try again
User guess:
7
Computer guess: 3
Too high, try again
User guess:
5
Computer guess: 5
good guess

 */