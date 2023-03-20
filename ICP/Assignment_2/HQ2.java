/*Name- Anish more
 Registration no.=2241013365
 name of the program:If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. (This is
essentially the definition of the / and % operators for integers.) Write a java program that asks
the user how many eggs she has and then tells the user how many dozen eggs she has and how
many extra eggs are left over. A gross of eggs is equal to 144 eggs. Extend your program so
that it will tell the user how many gross, how many dozen, and how many left over eggs she
has. For example, if the user says that she has 1342 eggs, and then your program would respond
with Your number of eggs is 9 gross, 3 dozen, and 10.*/

/*import java.util.Scanner;
public class hq2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of eggs: ");
		double n=sc.nextDouble();
		double g=n/144;
		double d=((g-(int)g)*144)/12;
		double l=((g-(int)g)*144)%12;
		
		System.out.println("Your number of eggs is "+(int)g+" gross "+(int)d+" dozen and "+(int)l+" left over");
	}
}
*/

import java.util.Scanner;
public class HQ2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of eggs: ");
		int n=sc.nextInt();
		int g=n/144;
		int d=(n%144)/12;
		int l=((n%144)%12);
		System.out.println("Your number of eggs is "+g+" gross "+d+" dozen and "+l+" left over");
	}
}
/*Output---
Enter the number of eggs: 
1000
Your number of eggs is 6 gross 11 dozen and 4 left over
*/