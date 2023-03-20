/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a java program to create an array of size N and store the random values between 1 to N in it and find the sum and average.*/
import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of terms ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=(int)(Math.random()*n+1);
			sum+=arr[i];
		}
		System.out.println("Sum= "+sum);
		System.out.println("Average = "+(sum/n));
		
	}
}
	
/*Output
Enter number of terms 10
Sum= 66
Average = 6
 */
