/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a menu driven program to perform several mathematical operations. Different choices for 
 the mathematical operations are as follows.
1. Determine the factorial of a number
2. Determine XN for two numbers X, N
3. Determine GCD of two number.
4. Binary equivalent of a decimal number
5. Product of two numbers.
NOTE: All the mathematical operations must be performed using the recursive method.*/

import java.util.Scanner;
public class Q7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Determine the factorial of a number\n"
				+ "2. Determine XN for two numbers X, N\n"
				+ "3. Determine GCD of two number.\n"
				+ "4. Binary equivalent of a decimal number\n"
				+ "5. Product of two numbers.");
		System.out.print("Enter your choice number: ");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.print("Enter the number: ");
			int num=sc.nextInt();
			long fact=factorial(num);
			System.out.println("The factorial of the number is: "+fact);
			break;
		
		case 2:
			System.out.println("Enter X, N");
			int X=sc.nextInt();
			int N=sc.nextInt();
			long result=power(X,N);
			System.out.println("X to the power N = "+result);
			break;
		case 3:
			System.out.println("Enter two number");
			int x=sc.nextInt();
			int y=sc.nextInt();
			int gcd=gcd(x,y);
			System.out.println("the gcd of "+x+" and "+y+" is: "+gcd);
			break;
		case 4:
			System.out.println("Enter decimal number");
			int number=sc.nextInt();
			String binary=toBinary(number);
			System.out.println("Binary equivalent of "+number+" is: "+binary);
			break;
		case 5:
			System.out.println("Enter two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			long p=product(a,b);
			System.out.println("Product of "+a+" and "+b+" is: "+p);
			break;
		}
	}
	
	public static long factorial(int num) {
		if(num==1)
			return 1;
		return num*factorial(num-1);
	}
	public static long power(int X,int N)
	{
		if(N==0)
			return 1;
		return X*power(X,N-1);
	}
	public static int gcd(int x,int y)
	{
		if(x%y==0)
			return y;
		return gcd(y,x%y);
	}
	public static String toBinary(int number) {
		if(number==1)
			return "1";
		return toBinary(number/2)+(number%2);
	}
	public static long product(int x,int y)
	{
		if(y==0)
			return 0;
		return x+product(x,--y);
	}
	
}
/*Output---
 Sample run 1:
1. Determine the factorial of a number
2. Determine XN for two numbers X, N
3. Determine GCD of two number.
4. Binary equivalent of a decimal number
5. Product of two numbers.
Enter your choice number: 1
Enter the number: 5
The factorial of the number is: 120

Sample run 2:
1. Determine the factorial of a number
2. Determine XN for two numbers X, N
3. Determine GCD of two number.
4. Binary equivalent of a decimal number
5. Product of two numbers.
Enter your choice number: 2
Enter X, N
2 3
X to the power N = 8

Sample run 3:
1. Determine the factorial of a number
2. Determine XN for two numbers X, N
3. Determine GCD of two number.
4. Binary equivalent of a decimal number
5. Product of two numbers.
Enter your choice number: 3
Enter two number
56 98
the gcd of 56 and 98 is: 14


Sample run 4:
1. Determine the factorial of a number
2. Determine XN for two numbers X, N
3. Determine GCD of two number.
4. Binary equivalent of a decimal number
5. Product of two numbers.
Enter your choice number: 4
Enter decimal number
4
Binary equivalent of 4 is: 100


Sample run 5:
1. Determine the factorial of a number
2. Determine XN for two numbers X, N
3. Determine GCD of two number.
4. Binary equivalent of a decimal number
5. Product of two numbers.
Enter your choice number: 5
Enter two numbers
4 5
Product of 4 and 5 is: 20
*/