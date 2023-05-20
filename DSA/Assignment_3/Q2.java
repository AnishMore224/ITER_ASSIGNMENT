/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Assign your favourite colours in an array. Identify 2 exceptions that may be generated & 
 write exceptional handler in Java. Also, display the four colours after handling any 2 exceptions.*/
import java.util.Scanner;
public class Q2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter four colours");
		String arr[]=new String[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		try {
			Integer.parseInt(arr[0]);
		}
		catch(NumberFormatException e){
			System.out.println(e);
		}
		try {
			arr[4]="Orange";
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
	}
}
/*Output---
Enter four colours
Red Blue Green Yellow
java.lang.NumberFormatException: For input string: "Red"
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
Red  Blue  Green  Yellow  
*/
