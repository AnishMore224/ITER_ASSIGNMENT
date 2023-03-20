/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program that reads a Fahrenheit degree in a double value from the console, then
converts it to Celsius and displays the result. The formula for the conversion is as follows:
Celsius = (Fahrenheit-32) *(5/9)
Hint: Hint: In Java, 5 / 9 is 0, but 5.0 / 9 is 0.556
Here is a sample run:
Enter a degree in Fahrenheit: 54
54 Fahrenheit is 12.22 Celsius*/

import java.util.Scanner;
public class Q1 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a degree in Fahrenheit: ");
	double f=sc.nextDouble();
	double C;
	C=(f-32) *(5.0/9);
	System.out.println(f+" Fahrenheit is "+C+" Celsius");

	}
}
/*Output---
Enter a degree in Fahrenheit: 
54
54.0 Fahrenheit is 12.222222222222223 Celsius
*/