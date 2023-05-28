/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a simple main class in Java that contains an experiment that uses the generic Box<T> 
 class to build boxes with different types and that verifies that this class works as advertised. Your experiment should 
 include the following:
 Create a boxed String object and two variables that refer to that box. Change the contents of one and determine the 
effect on the other.
 Create a boxed Integer object and two variables that refer to that box. Change the contents of one and determine the 
effect on the other.
 Create a boxed Object object and two variables that refer to that box. Determine what happens if you put a string in the box. 
Determine what happens if you put an integer in the box.*/

import java.util.Scanner;
class Box<T>{
	T t;
	Box(T t)
	{
		this.t=t;
	}
	T get()
	{
		return t;
	}
	void set(T t)
	{
		this.t=t;
	}
}
public class Q6 
{
	
	public static void main(String[] args) 
	{
		Box<String> strObj1=new Box<>("It is a String Box");
		Box<String> strObj2=strObj1;
		System.out.println("Before change String box 1 value: "+strObj1.get());
		System.out.println("Before change String box 2 value: "+strObj2.get());
		strObj1.set("Box string value is changed");
		System.out.println("After change String box 1 value: "+strObj1.get());
		System.out.println("After change String box 2 value: "+strObj2.get());
		
		Box<Integer> intObj1=new Box<>(2204);
		Box<Integer> intObj2=intObj1;
		System.out.println("\nBefore change Integer box 1 value: "+intObj1.get());
		System.out.println("Before change Integer box 2 value: "+intObj2.get());
		intObj1.set(2244);
		System.out.println("After change Integer box 1 value: "+intObj1.get());
		System.out.println("After change Integer box 2 value: "+intObj2.get());
		
		Box<Object> obj1=new Box<>(new Object());
		Box<Object> obj2=obj1;
		obj1.set("String");
		System.out.println("\nBox 1 object value when string is put: "+obj1.get());
		System.out.println("Box 2 object value when string is put: "+obj2.get());
		obj1.set(2244);
		System.out.println("Box 1 object value when integer is put: "+obj1.get());
		System.out.println("Box 2 object value when integer is put: "+obj2.get());
		
	}
}


/*Output---
Before change String box 1 value: It is a String Box
Before change String box 2 value: It is a String Box
After change String box 1 value: Box string value is changed
After change String box 2 value: Box string value is changed

Before change Integer box 1 value: 2204
Before change Integer box 2 value: 2204
After change Integer box 1 value: 2244
After change Integer box 2 value: 2244

Box 1 object value when string is put: String
Box 2 object value when string is put: String
Box 1 object value when integer is put: 2244
Box 2 object value when integer is put: 2244
*/ 