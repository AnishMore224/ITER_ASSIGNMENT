	/* Name- Anish more
 Registration no.=2241013365
 name of the program:Write a java program to find the difference between the sum of the squares of the first ten
natural numbers and the square of the sum.
*/
public class HQ1 
{
	public static void main(String[] args) 
	{
		int sq=0,sum=0;
		for(int i=1;i<=10;i++)
		{
			sq+=i*i;
			sum+=i;
		}
		int sqsum=sum*sum;
		System.out.println("The sum of the squares of the first ten natural numbers is:1 2 + 2 2 + 3 2 + 4 2 + 5 2 + 6 2 + 7 2 + 8 2 + 9 2 + 10 2 ="+sq);
		System.out.println("The sum of the squares of the first ten natural numbers is:1 2 + 2 2 + 3 2 + 4 2 + 5 2 + 6 2 + 7 2 + 8 2 + 9 2 + 10 2 ="+sqsum);
		System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is "+sq+" −  "+sqsum+"="+(sqsum-sq));

	}

}
/*ouput--
The sum of the squares of the first ten natural numbers is:1 2 + 2 2 + 3 2 + 4 2 + 5 2 + 6 2 + 7 2 + 8 2 + 9 2 + 10 2 =385
The sum of the squares of the first ten natural numbers is:1 2 + 2 2 + 3 2 + 4 2 + 5 2 + 6 2 + 7 2 + 8 2 + 9 2 + 10 2 =3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 385 −  3025=2640

*/