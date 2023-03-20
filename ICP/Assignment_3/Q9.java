/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a program to input 3 integer number a, b, c. Find the 
 largest number among 3. Also find the 2 nd largest number among 3. Here is the 
 sample output:Enter the value of a, b, c:10 30 50
Largest number: 50
2 nd largest number: 30*/
import java.util.Scanner;
public class Q9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number: ");
		int a=sc.nextInt();
		System.out.println("Input second number: ");
		int b=sc.nextInt();
		System.out.println("Input third number: ");
		int c=sc.nextInt();
		int max=Math.max(a,Math.max(b,c));
		System.out.println("Largest number:"+max);
		if((a>b||a>c)&&a<max)
		{
				System.out.println("2nd largest number:"+a);
		}
		if((b>a||b>c)&&b<max)
		{
				System.out.println("2nd largest number:"+b);
		}
		else {
				System.out.println("2nd largest number:"+c);
		}
	}
}

/*output--
Input first number: 
10
Input second number: 
30
Input third number: 
50
Largest number:50
2nd largest number:30

 */