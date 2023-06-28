/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Static Implementation (Array Implementation)
A Queue is implemented statically by using an array of size MAX to hold the elements and it has
two ends (integers) – front and rear. The ‘front’ stores the position of the current front element
and ‘rear’ stores the position of the current rear element of the queue. The Queue elements can be
integers, characters, strings or user defined data types.
The operations to be performed on a Queue are
public static void insert(int Q[])-adding an element x to the rear end of the queue Q
public static void delete(int Q[])-deletes the element from the front of the queue Q
public static void display(int Q[])-display all the elements of the queue Q.
public static boolean is_full()-check if the queue is full or not.
public static boolean is_empty()-check if the queue is empty or not.
Write a menu driven Java Program using class, methods and array, to construct a Queue and
implement the above five operations..*/
import java.util.Scanner;
public class Q1 
{
	public static final int MAX=5;
	public static int front=-1;
	public static int rear=-1;
	public static boolean is_empty(){
		if(front==-1||rear==-1||front>rear)
			return true;
		return false;
	}
	
	
	public static boolean is_full(){
		if(rear==MAX-1)
			return true;
		return false;
	}
	
	
	public static void insert(int Q[]) 
	{
		if(is_full())
		{
			System.out.println("Queue Overflow");
		}
		else
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element to insert:");
		Q[++rear]=sc.nextInt();
		if(rear==0)
			front=0;
		}	
	}
	
	
	public static void delete(int Q[])
	{
		if(is_empty())
		{
			System.out.println("Queue Underflow");
		}
		else {
		System.out.println("Deleted item is: "+Q[front]);
		front++;
		}
	}
	
	
	public static void display(int Q[])
	{
		if(is_empty())
		{
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("Queue Elements are: ");
			for(int i=front;i<=rear;i++)
			{
				System.out.println(Q[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int queue[]=new int[MAX];
	while(true)
	 {
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Insert");
		System.out.println("2: Delete");
		System.out.println("3: Display");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 0:
				System.exit(0);
			case 1:
				insert(queue);
				break;
			case 2:
				delete(queue);
				break;
			case 3:
				display(queue);
				break;
			default:
				System.out.println("Invalid choice");
			}
	 	}
	}
}

/*Output--
 ***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
3
Queue is Empty
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
2
Queue Underflow
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
1
Enter the element to insert:1
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
1
Enter the element to insert:2
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
1
Enter the element to insert:3
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
3
Queue Elements are: 
1
2
3
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
1
Enter the element to insert:4
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
1
Enter the element to insert:5
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
3
Queue Elements are: 
1
2
3
4
5
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
1
Queue Overflow
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
2
Deleted item is: 1
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
2
Deleted item is: 2
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
2
Deleted item is: 3
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
2
Deleted item is: 4
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
2
Deleted item is: 5
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
2
Queue Underflow
***MENU***
0: Exit
1: Insert
2: Delete
3: Display
Enter your choice
0
 */