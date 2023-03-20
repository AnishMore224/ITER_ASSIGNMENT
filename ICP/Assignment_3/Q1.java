/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a program to input the age of a person and check if the age of the person is
greater than or equal to 18 then print the message:
“You are eligible to cast your vote”.*/
import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the age of a person:");
		int a=sc.nextInt();
		if(a>=18)
		{
			System.out.println("You are eligible to cast your vote");
		}
	}

}
/*output--
Input the age of a person:
18
You are eligible to cast your vote
*/