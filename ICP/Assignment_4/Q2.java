/* Name- Anish more
 Registration no.=2241013365
 name of the program:
 An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your
program to determine whether or not the number is divisible by 9. Test it on the following
numbers: Use while loop.
n = 123456
n = 154368
n = 621594
Hint: Use the % operator to get each digit; then use / operator to remove the digit.
*/
import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int b=n%10;
			sum=sum+b;
			n/=10;
		}
		if(sum%9==0)
			System.out.println("The number "+temp+" is divisible by 9");
		else
			System.out.println("The number "+temp+" is not divisible by 9");
	}
}
		
/*output--
Enter a number: 
123456
The number 123456 is not divisible by 9
 */