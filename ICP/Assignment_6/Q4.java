/*Name-Anish More
  Registration number:2241013365
  Name of the program:Write a method that returns the number of days in a year using the following header:
public static int numberOfDaysInAYear(int year)
Write a java program that displays the number of days in year from 2000 to 2020.*/
public class Q4 
{
	public static void main(String[] args) 
	{
		
		for(int i=2000;i<=2020;i++)
			System.out.println("Number of days in "+i+" is= "+numberOfDaysInAYear(i));
	}
	public static int numberOfDaysInAYear(int year)
	{
		if((year%4==0&&year%100!=0)||year%400==0)
			return 366;
		return 365;
	}
	
}
/*Output
Number of days in 2000 is= 366
Number of days in 2001 is= 365
Number of days in 2002 is= 365
Number of days in 2003 is= 365
Number of days in 2004 is= 366
Number of days in 2005 is= 365
Number of days in 2006 is= 365
Number of days in 2007 is= 365
Number of days in 2008 is= 366
Number of days in 2009 is= 365
Number of days in 2010 is= 365
Number of days in 2011 is= 365
Number of days in 2012 is= 366
Number of days in 2013 is= 365
Number of days in 2014 is= 365
Number of days in 2015 is= 365
Number of days in 2016 is= 366
Number of days in 2017 is= 365
Number of days in 2018 is= 365
Number of days in 2019 is= 365
Number of days in 2020 is= 366

 */
