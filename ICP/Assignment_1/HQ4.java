/*Suppose that a variable a is declared as double a = 3.14159. What do each of the following
print?
a) System.out.println(a);
b) System.out.println(a+1);
c) System.out.println(8/(int) a);
d) System.out.println(8/a);
e) System.out.println((int) (8/a));*/
public class HQ4 
{
	public static void main(String[] args) 
	{
		double a = 3.14159;
		System.out.println(a);
		System.out.println(a+1);
		System.out.println(8/(int) a);
		System.out.println(8/a);
		System.out.println((int) (8/a));
	}
}

/*Output---
 3.14159
4.14159
2
2.5464812403910124
2

 */
