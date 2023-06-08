/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-In the Towers of Hanoi puzzle, we are given a platform with three pegs, a, b, and c, sticking out of it. 
 On peg a is a stack of n disks, each larger than the next, so that the smallest is on the top and the largest is on the bottom. 
 The puzzle is to move all the disks from peg a to peg c, moving one disk at a time, so that we never place a larger disk on 
 top of a smaller one. See Figure 1 for an example of the case n = 4. Write a recursive program using Java for solving 
 the Towers of Hanoi puzzle for arbitrary n. (Hint: Consider first the sub problem of moving all but the nth disk from 
 peg a to another peg using the third as “temporary storage.”)
*/
import java.util.Scanner;
public class HQ5 
{
	public static void hanoipuzzle(int n,char first,char middle,char last) 
	{
		if(n==0)
			return;
		hanoipuzzle(n-1,first,last,middle);
		System.out.println("Move disk "+n+" from rod "+first+" to rod "+last);
		hanoipuzzle(n-1,middle,first,last);
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter N: ");
		int n=sc.nextInt();
		hanoipuzzle(n,'a','b','c');
	}
}
/*Output---
Sample run 1:
Enter N: 3
Move disk 1 from rod a to rod c
Move disk 2 from rod a to rod b
Move disk 1 from rod c to rod b
Move disk 3 from rod a to rod c
Move disk 1 from rod b to rod a
Move disk 2 from rod b to rod c
Move disk 1 from rod a to rod c

Sample run 2:
Enter N: 4
Move disk 1 from rod a to rod b
Move disk 2 from rod a to rod c
Move disk 1 from rod b to rod c
Move disk 3 from rod a to rod b
Move disk 1 from rod c to rod a
Move disk 2 from rod c to rod b
Move disk 1 from rod a to rod b
Move disk 4 from rod a to rod c
Move disk 1 from rod b to rod c
Move disk 2 from rod b to rod a
Move disk 1 from rod c to rod a
Move disk 3 from rod b to rod c
Move disk 1 from rod a to rod b
Move disk 2 from rod a to rod c
Move disk 1 from rod b to rod c
  
*/