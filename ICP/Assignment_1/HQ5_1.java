
public class HQ5_1 
{
	public static void main(String[] args) 
	{
		int W=1,G=2,K=3,A=4;
		System.out.println("Before swapping, W="+W+",G="+G+",K="+K+",A="+A);
		W=W+G+K+A;
		A=W-(G+K+A);
		K=W-(G+K+A);
		G=W-(G+K+A);
		W=W-(G+K+A);
		System.out.println("After swapping, W="+W+",G="+G+",K="+K+",A="+A);
	}
}

/*Output---
Before swapping, W=1,G=2,K=3,A=4
After swapping, W=2,G=3,K=4,A=1

*/