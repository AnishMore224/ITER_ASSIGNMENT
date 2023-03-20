/*Name- Anish more
 Registration no.=2241013365
 name of the program:Enter the basic salary of an employee of an organization through the keyboard. His dearness
allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic
salary. Write a java program to calculate his gross salary. Print the DA, HRA and Gross
salary.*/
import java.util.Scanner;
public class Q3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		double s=sc.nextDouble();
		double da=0.4*s;
		double hra=0.2*s;
		double g=s+da+hra;
		System.out.println("DA is "+da);
		System.out.println("HRA is "+hra);
		System.out.println("Gross salary is "+g);
		
	}
}
/*Output---
Enter basic salary: 
1560
DA is 624.0
HRA is 312.0
Gross salary is 2496.0
*/