/*
 *Name:Anish More
 Registration number:2241013365
 Name of program:
 Q1. Write a program to convert an integer to an Integer object.
Q2. Write a program to convert a float to a Float object.
Q3. Write a program to convert a double to a Double object.
Q4. Write a program to convert a boolean to a Boolean object.
Q5. Write a program to read an integer as a string and convert it to an Integer
object.
Q6. Write a program to read a float as a string and convert it to a Float object.
Q7. Write a program to read a double as a string and convert it to a Double object.
Q8. Write a program to read a boolean as a string and convert it to a Boolean
object.
Q9. Write a program that reads to convert int, float, double, and boolean as string
types and convert them to respective object types using the valueOf method.
1
 
 */
public class Q1_9 {

	public static void main(String[] args) {
		// Q1
		Integer i = new Integer(10);
		System.out.println(i);
		// Q2
		Float f = new Float(10.5f);
		System.out.println(f);
		// Q3
		Double d = new Double(10.5);
		System.out.println(d);
		// Q4
		Boolean b = new Boolean(true);
		System.out.println(b);
		// Q5
		Integer i1 = new Integer("10");
		System.out.println(i1);
		// Q6
		Float f1 = new Float("10.5f");
		System.out.println(f1);
		// Q7
		Double d1 = new Double("10.6");
		System.out.println(d1);
		// Q8
		Boolean b1 = new Boolean("true");
		System.out.println(b1);
		// Q9
		Integer i2 = Integer.valueOf("11");
		Float f2 = Float.valueOf("11.7f");
		Double d2 = Double.valueOf("11.4");
		Boolean b2 = Boolean.valueOf("false");
		System.out.println(i2 + "\n" + f2 + "\n" + d2 + "\n" + b2);
	}

}

/*
 * Output--
 * 10
 * 10.5
 * 10.5
 * true
 * 10
 * 10.5
 * 10.6
 * true
 * 11
 * 11.7
 * 11.4
 * false
 */