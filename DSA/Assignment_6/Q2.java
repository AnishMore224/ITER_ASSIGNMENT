/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Dynamic Implementation (Linked List Implementation)
A stack is implemented dynamically by using a Linked list where each node in the linked list has
two parts, the data element and the reference to the next element of the stack. The class
defintion of Node is given below.
class Node
{
int info;
Node next;
}
The stack elements can be integers, characters, strings or user defined data types. There is no
restriction on how big the stack can grow.
The operations to be performed on a stack are
public static Node push(Node top) - Add an element x to the stack S requires creation of
node containing x and putting it in front of the top node pointed by S.
public static Node pop(Node top)- Delete the top node from the stack S so that next
element becomes the top.
public static void display(Node top)- Display all the elements of Stack S.
Write a menu driven Java Program using class, methods and list, to construct a Stack and
implement the above three operations.*/
import java.util.Scanner;
class Node
{
	int info;
	Node next;
}
public class Q2 
{
	
	public static Node push(Node top)
	{
		Scanner sc=new Scanner(System.in);
		Node newNode=new Node();
		System.out.print("Enter the info:");
		newNode.info=sc.nextInt();
		newNode.next=top;
		top=newNode;
		return top;
	}
	
	
	public static Node pop(Node top)
	{
		if(top==null)
		{
			System.out.println("Stack Underflow");
			return top;
		}
		System.out.println("Deleted item is: "+top.info);
		top=top.next;
		return top;
	}
	
	public static void display(Node top)
	{
		if(top==null)
			System.out.println("No element in stack");
		Node temp=top;
		while(temp!=null)
		{
			System.out.print(temp.info+"  ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Node top;
		top=null;
		while(true)
		{
			System.out.println("\n****MENU****");
			System.out.println("0:Exit");
			System.out.println("1:Push");
			System.out.println("2:Pop");
			System.out.println("3:Display");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				System.exit(0);
			case 1:
				top=push(top);
				break;
			case 2:
				top=pop(top);
				break;
			case 3:
				display(top);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
