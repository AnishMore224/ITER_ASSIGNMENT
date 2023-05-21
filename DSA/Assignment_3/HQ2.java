/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a recursive method in Java to search an element of an array using binary search.*/
import java.util.Scanner;
public class HQ2 
{
	public static int binarySearch(int start, int end,int []arr,int key) {
		if(start<=end&&start<arr.length)
		{
		int mid=start+(end-start)/2;
		if(arr[mid]==key)
			return mid;
		else if(arr[mid]>key)
			return binarySearch(start,mid-1,arr,key);
		return binarySearch(mid+1,end,arr,key);
		}
		return -1;
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number of elements in the array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" number of elements in ascending order");
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		System.out.print("Enter the element to search: ");
		int key=sc.nextInt();
		int index=binarySearch(0,n,arr,key);
		if(index==-1)
			System.out.println("The "+key+" is not present in the array");
		else {
			System.out.println("The "+key+" is present at index "+index);
		}
	}
}
/*Output---
Sample run-1:
Enter number of elements in the array: 5
Enter 5 number of elements in ascending order
11 22 33 44 55
Enter the element to search: 33
The 33 is present at index 2

Sample run-2:
Enter number of elements in the array: 5
Enter 5 number of elements in ascending order
11 22 33 44 55
Enter the element to search: 66
The 66 is not present in the array
*/