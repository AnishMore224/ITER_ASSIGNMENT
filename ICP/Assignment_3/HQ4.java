/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program that prompts the user to enter an integer and determines whether
it is divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible
by 5 or 6, but not both.
Here is a sample run of this program:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? True*/
import java.util.Scanner;
public class HQ4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number: ");
		int a=sc.nextInt();
		if(a%5==0&&a%6==0)
			System.out.println("Is 10 divisible by 5 and 6? true");
		else
			System.out.println("Is 10 divisible by 5 and 6? false");
		if(a%5==0||a%6==0)
				System.out.println("Is 10 divisible by 5 or 6? true");
		else
			System.out.println("Is 10 divisible by 5 or 6? false");

		if(a%5==0||a%6==0&&a%30!=0)
			System.out.println("Is 10 divisible by 5 or 6, but not both? true");
		else
			System.out.println("Is 10 divisible by 5 or 6, but not both? false");
		}
	}


/*output--
Input number: 
10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true

 */