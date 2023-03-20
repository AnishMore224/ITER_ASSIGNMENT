/*Name-Anish More
  Registration number:2241013365
  Name of the program:Design and develop a menu driven java program for the following array operations.
a. Create an array of N integers
b. Display the array elements
c. Insert an element at specific position
d. Delete an element at a given position
e. Exit*/
import java.util.Scanner;
public class Q10
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("a. Create an array of N integers");
		System.out.println("b. Display the array elements");
		System.out.println("c. Insert an element at specific position");
		System.out.println("d. Delete an element at a given position");
		System.out.println("e. Exit");
		
		boolean b=true;
		System.out.print("Enter no. of elements: ");
		 int n=sc.nextInt();
		int arr[]=new int[n+1];
		while(b)
		{
			System.out.println("\nEnter the option which you want to perform: ");
			char ch=sc.next().charAt(0);
			switch(ch) {
			case 'a':
				create(arr,n);
				break;
			case 'b':
				display(arr,n);
				break;
			case 'c':
				insert(n,arr);
				break;
			case'd':
			delete(n,arr);
			break;
			case'e':
				b=false;
				break;
				default:
					System.out.println("Inavlid option");
			}
		}
	}
		public static void create(int arr[],int n) 
		{
			System.out.println("Enter the elements");
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
		public static void display(int arr[],int n)
		{
			for(int i=0;i<n+1;i++)
			{
				System.out.print(arr[i]+"  ");
			}
		}
		public static void  insert(int n,int arr[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the position in which you want to insert : ");
			int p=sc.nextInt();
			System.out.println("Enter the element you want to insert : ");
			int n1=sc.nextInt();
			for(int i=n;i>p-1;i--)
			{
				arr[i]=arr[i-1];
			}
			arr[p-1]=n1;
		}

		public static void  delete(int n,int arr[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the position in which you want to delete : ");
			int p=sc.nextInt();
			for(int i=p-1;i<n;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[n]=0;
		}
		
}
	
/*Output
a. Create an array of N integers
b. Display the array elements
c. Insert an element at specific position
d. Delete an element at a given position
e. Exit
Enter no. of elements: 5

Enter the option which you want to perform: 
a
Enter the elements
1
2
3
4
5

Enter the option which you want to perform: 
b
1  2  3  4  5  0  
Enter the option which you want to perform: 
c
Enter the position in which you want to insert : 
2
Enter the element you want to insert : 
8

Enter the option which you want to perform: 
d
Enter the position in which you want to delete : 
2

Enter the option which you want to perform: 
b
1  2  3  4  5  0  
Enter the option which you want to perform: 
e

 */
