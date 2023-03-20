/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a java program using an array that reads the integers
   between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.
Sample run: Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0 2 occurs 2 times 3 occurs 1 time 4 occurs 1 time 5 occurs 
2 times 6 occurs 1 time 23 occurs 1 time 43 occurs 1 time Note: If a number occurs more than one time, the plural word “times” is used in the output.*/
import java.util.Scanner;
public class Q3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100:");
		int arr[]=new int[100];
		boolean b=true;
		while(b)
		{
			int n=sc.nextInt();
			if(n==0)
				break;
			for(int i=0;i<arr.length;i++)
			{
				if(n==i+1) {
					arr[i]++;
					break;
				}
			}
		}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>1)
					System.out.println((i+1)+ " occurs "+arr[i]+" times");
				else if(arr[i]>0)
					System.out.println((i+1)+ " occurs "+arr[i]+" time");
			}
	}
}
	
/*Output
Enter number of terms 5
11
22
33
39
43
The number of prime numbers are 2

 */
