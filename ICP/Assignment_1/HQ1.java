/*What do each of the following print?
a) System.out.println(2 + "bc");
b) System.out.println(2 + 3 + "bc");
c) System.out.println((2+3) + "bc");
d) System.out.println("bc" + (2+3));
e) System.out.println("bc" + 2 + 3);
*/
public class HQ1 
{
	public static void main(String[] args)
	{
		System.out.println(2 + "bc");
		System.out.println(2 + 3 + "bc");
		System.out.println((2+3) + "bc");
		System.out.println("bc" + (2+3));
		System.out.println("bc" + 2 + 3);
	}
}

/*Output---
 2bc
5bc
5bc
bc5
bc23
 */