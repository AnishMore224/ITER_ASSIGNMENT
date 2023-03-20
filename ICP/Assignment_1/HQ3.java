/*Suppose that a variable a is declared as int a = 2147483647 (or equivalently,
Integer.MAX_VALUE ). What do each of the following print?
a) System.out.println(a);
b) System.out.println(a+1);
c) System.out.println(2-a);
d) System.out.println(-2-a)
e) System.out.println(2*a);
f) System.out.println(4*a);*/
public class HQ3 
{
	public static void main(String[] args) 
	{
		int a = 2147483647;
		System.out.println(a);
		System.out.println(a+1);
		System.out.println(2-a);
		System.out.println(-2-a);
		System.out.println(2*a);
		System.out.println(4*a);

	}
}
/*Output---
 2147483647
-2147483648
-2147483645
2147483647
-2
-4
*/
