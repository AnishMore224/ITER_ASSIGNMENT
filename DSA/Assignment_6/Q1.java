/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Static Implementation (Array Implementation)
A stack is implemented statically by using an array of size MAX to hold stack elements and an
integer top storing the position of top of the stack. The stack elements can be integers, characters,
strings or user defined data types.
The operations to be performed on a stack are
public static int push(int S[],int top) – adding an element x to the stack S
public static int pop(int S[],int top)– deletes and returns the top element from the stack
S
public static void display(int S[],int top)- display all the elements of Stack S
public static boolean isEmpty(int top) – check if the stack is empty
public static boolean isFull(int top) – check if the stack is full when top equals MAX -1
Write a menu driven Java Program using class, methods and array, to construct a Stack and
implement the above five operations.*/
import java.util.Scanner;
public class Q1 
{
	public static final int MAX=10;
	
	
	public static boolean isEmpty(int top){
		if(top==-1)
			return true;
		return false;
	}
	
	
	public static boolean isFull(int top){
		if(top==MAX-1)
			return true;
		return false;
	}
	
	
	public static int push(int S[],int top) 
	{
		if(isFull(top))
		{
			System.out.println("Stack Overflow");
			return top;
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element to insert:");
		S[++top]=sc.nextInt();
		return top;
	}
	
	
	public static int pop(int S[],int top)
	{
		if(isEmpty(top))
		{
			System.out.println("Stack Underflow");
			return top;
		}
		System.out.println("Deleted item is: "+S[top]);
		return --top;
	}
	
	
	public static void display(int S[],int top) 
	{
		if(isEmpty(top))
		{
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Stack Elements are: ");
			for(int i=top;i>=0;i--)
			{
				System.out.println(S[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int stack[]=new int[MAX];
	int top=-1;
	while(true)
	 {
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Push");
		System.out.println("2: Pop");
		System.out.println("3: Display");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 0:
				System.exit(0);
			case 1:
				top=push(stack,top);
				break;
			case 2:
				top=pop(stack,top);
				break;
			case 3:
				display(stack,top);
				break;
			default:
				System.out.println("Invalid choice");
			}
	 	}
	}
}