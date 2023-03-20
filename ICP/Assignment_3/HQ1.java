/* Name- Anish more
 Registration no.=2241013365
 name of the program:
Write a java program that plays the popular scissor-rock-paper game. (A scissor can cut
a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program
randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The
program prompts the user to enter a number 0, 1, or 2 and displays a message indicating
whether the user or the computer wins, loses, or draws.
Here are sample runs:
scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw*/
import java.util.Scanner;
public class HQ1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 for scissor,1 for rock,2 for paper");
		int b=sc.nextInt();
		int a=(int)(Math.random()*3);
		if(a==b)
		{
			if(a==0)
				System.out.println("The computer is scissor. You are scissor too. It is a draw");
			else if(a==1)
				System.out.println("The computer is rock. You are rock too. It is a draw");
			else
				System.out.println("The computer is paper. You are paper too. It is a draw");
		}
		else {
			if(a==0&&b==1)
				System.out.println("The computer is scissor. You are rock. You won");
			else if(a==1&&b==2)
				System.out.println("The computer is rock. You are paper. You won");
			else if(a==2&&b==0)
				System.out.println("The computer is paper. You are scissor. You won");
			else if(a==1&&b==0)
				System.out.println("The computer is rock. You are scissor. You loss");
			else if(a==2&&b==1)
				System.out.println("The computer is paper. You are rock. You loss");
			else if(a==0&&b==2)
				System.out.println("The computer is scissor. You are paper. You loss");
		}
	}

}
/*outpuut--
Enter 0 for scissor,1 for rock,2 for paper
1
The computer is scissor. You are rock. You won
*/
