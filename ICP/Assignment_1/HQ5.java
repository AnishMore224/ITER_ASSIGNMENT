/*Write a java program to exchange the value of 4 variables W,G,K,A such that the value of
W will move to A, A to K, K to G and finally G to W. Exchange using with and without
using extra variables*/
public class HQ5 
{
	public static void main(String[] args) 
	{
		int W=1,G=2,K=3,A=4,C;
		System.out.println("Before swapping, W="+W+",G="+G+",K="+K+",A="+A);
		C=W;
		W=G;
		G=K;
		K=A;
		A=C;
		System.out.println("After swapping, W="+W+",G="+G+",K="+K+",A="+A);
	}
}
/*Output---
Before swapping, W=1,G=2,K=3,A=4
After swapping, W=2,G=3,K=4,A=1
*/