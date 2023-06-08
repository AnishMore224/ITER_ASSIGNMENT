/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Given an unsorted array, A, of integers and an integer k, write recursive program using Java 
 for rearranging the elements in A so that all elements less than or equal to k come before any elements larger than k.*/
import java.util.Scanner;
public class HQ4 
{
	public static void sort(int[] arr,int i,int j,int pivot) 
	{
		if(i<arr.length&&j<arr.length) 
		{
			if(arr[i]<=pivot)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			sort(arr,++i,j,pivot);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter k: ");
		int k=sc.nextInt();
		sort(arr,0,0,k);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
	}
}
/*Output---
Sample run 1:
Enter number of elements: 9
2 1 4 7 11 2 4 9 10
Enter k: 7
2  1  4  7  2  4  11  9  10  

Sample run 2:
Enter number of elements: 8
4 2 6 1 9 10 2 1
Enter k: 6
4  2  6  1  2  1  9  10  
*/