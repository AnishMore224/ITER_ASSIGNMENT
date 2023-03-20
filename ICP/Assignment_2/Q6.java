/*Name- Anish more
 Registration no.=2241013365
 name of the program:When a brick is dropped from a tower, it falls faster and faster until it hits the earth. The
distance it travels is given by d = (1/2) gt 2
Here d is in feet, t is the time in seconds, and g is 32.174.
Write a program that asks the user for the number of seconds and then prints out the distance
travelled.*/

import java.util.Scanner;
public class Q6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of seconds: ");
		double t=sc.nextDouble();
		double d=(1.0/2)*32.174*t*t;
		System.out.println("Distance travelled: "+d+" feet");
		
	}
}
/*Output---
 Enter the number of seconds: 
5.4
Distance travelled: 469.09692 feet
*/
