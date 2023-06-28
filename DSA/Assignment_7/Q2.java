/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Dynamic Implementation (Linked List Implementation)
A Queue is implemented dynamically by using a Linked list where each node in the linked list has
two parts, the data element and the reference to the next element of the queue.
The class definition of Node is given below.
class Node
{
int info;
Node next;
}
The Queue elements can be integers, characters, strings or user defined types. There is no restriction
on how big the Queue can grow.
The operations to be performed on a Queue:
public static Node insert (Node rear, Node front) - adding an element x to the queue
Q requires creation of node containing x and putting it next to the rear and rear points to the newly
added element.
public static Node delete (Node rear, Node front) - deletes the front node from the
queue Q
public static void display (Node rear, Node front)-display all the elements of
the queue Q.
Write a menu driven Java Program using class, methods and list, to construct a Queue and
implement the above three operations.*/
import java.util.Scanner;
class Node
{
	int info;
	Node next;
}
public class Q2 
{
	
	public static Node insert (Node rear, Node front)
	{
		Scanner sc=new Scanner(System.in);
		Node newNode=new Node();
		System.out.print("Enter the info:");
		newNode.info=sc.nextInt();
		newNode.next=null;
		if(front==null||rear==null)
		{
			front=newNode;
			rear=newNode;
			return front;
		}
		rear.next=newNode;
		rear=newNode;
		return front;
	}
	
	
	public static Node delete (Node rear, Node front)
	{
		if(front==null)
		{
			System.out.println("Queue Underflow");
			return front;
		}
		System.out.println("Deleted item is: "+front.info);
		front=front.next;
		return front;
	}
	
	
	public static void display (Node rear, Node front)
	{
		if(front==null)
			System.out.println("No element in Queue");
		else {
			Node temp=front;
			while(temp!=rear)
			{
				System.out.print(temp.info+"  ");
				temp=temp.next;
			}
			System.out.println(temp.info+"  ");
		}
	}
	
	
	public static Node getRear(Node front)
	{
		Node temp=front;
		while(temp.next!=null)
			temp=temp.next;
		return temp;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Node rear=null,front=null;
		while(true)
		{
			System.out.println("****MENU****");
			System.out.println("0:Exit");
			System.out.println("1:Insert");
			System.out.println("2:Delete");
			System.out.println("3:Display");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				System.exit(0);
			case 1:
				front=insert(rear,front);
				rear=getRear(front);
				break;
			case 2:
				front=delete(rear,front);
				break;
			case 3:
				display(rear,front);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
/*Output--
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
3
No element in stack
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
1
Enter the info:1
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
1
Enter the info:2
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
3
1  2  
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
1
Enter the info:3
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
1
Enter the info:4
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
3
1  2  3  4  
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
2
Deleted item is: 1
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
3
2  3  4  
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
2
Deleted item is: 2
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
2
Deleted item is: 3
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
2
Deleted item is: 4
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
2
Queue Underflow
****MENU****
0:Exit
1:Insert
2:Delete
3:Display
Enter your choice
*/