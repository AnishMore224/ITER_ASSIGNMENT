/*Name- Anish more
 Registration no.=2241013365
 name of the program:Assume a string variable ruler1 contains “1” initially i.e. String ruler1=”1” Write a java
program to print the following output using string concatenation. (You can take extra string
variables)*/
public class Q10
{
	public static void main(String[] args) 
	{
		String r1="1";
		String r2=r1+2+r1;
		String r3=r2+3+r2;
		String r4=r3+4+r3;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
/*Output---
1
121
1213121
121312141213121
*/