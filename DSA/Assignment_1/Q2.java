/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
human body fat in populations. It is computed by taking the individual's weight (mass) in
kilograms and dividing it by the square of their height in meters. i.e.
Weight (kg).
Write a java program by using conditional statement to show the category for a given BMI.
 */
import java.util.Scanner;
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter person Weight in kg:");
		double w=sc.nextDouble();
		System.out.print("Enter height of person in meter:");
		double h=sc.nextDouble();
		double bmi=w/(h*h);
		String result="";
		if(bmi<18.5)
			result="Underweight";
		else if(bmi<=24.9)
			result="Normal Weight";
		else if(bmi<=29.9)
			result="Overweight";
		else
			result="Obese";
		System.out.println("The person is "+result);
	}	
}
/*Output---
Enter person Weight in kg:96
Enter height of person in meter:1.4
The person is Obese
*/
