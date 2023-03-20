/*Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program that displays the following table. Cast floating-point 
 numbers into integers.*/
/*import java.util.Scanner;
public class q7 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a ");
		int a=sc.nextInt();
		System.out.println("Enter b ");
		int b=sc.nextInt();
		System.out.println("a\tb\tpow(a,b)");
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		a++;
		b++;
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		
	}
}*/
import java.util.Scanner;
public class Q7 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a ");
		int a=sc.nextInt();
		System.out.println("Enter b ");
		int b=sc.nextInt();
		System.out.println("a\tb\tpow(a,b)");
		System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
		System.out.println((++a)+"\t"+(++b)+"\t"+(int)Math.pow(a, b));
		System.out.println((++a)+"\t"+(++b)+"\t"+(int)Math.pow(a, b));
		System.out.println((++a)+"\t"+(++b)+"\t"+(int)Math.pow(a, b));
		System.out.println((++a)+"\t"+(++b)+"\t"+(int)Math.pow(a, b));
		
	}
}
/*Output---
 Enter a 
1
Enter b 
2
a	b	pow(a,b)
1	2	1
2	3	8
3	4	81
4	5	1024
5	6	15625
*/
