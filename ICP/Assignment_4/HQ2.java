/* Name- Anish more
 Registration no.=2241013365
 name of the program:If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23. Write a java program to find the sum of all the multiples
of 3 or 5 below 1000 .
*/
public class HQ2 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<1000;i++)
		{
			if(i%3==0||i%5==0)
			sum+=i;
		}
		System.out.println(sum);

	}

}
/*ouput--
233168
*/