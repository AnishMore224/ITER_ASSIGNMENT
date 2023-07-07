/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-Write a menu driven Java Program using class, methods and reference variables, to construct
a singly linked list consisting of the following information in each node: student regd_no
(int), mark secured in a subject (float).
The class definition should be as follows.
class Node
{
protected int regd_no;
protected float mark;
protected Node next;
}
The prototype of the create method should be as follows.
public static void create(Node start)
Define the methods for each of the following operations to be supported by the above
linked list are:
a) The insertion operation
i. At the beginning of the list
Method Prototype: public static Node InsBeg(Node start)
ii. At the end of the list
Method Prototype: public static Node InsEnd(Node start)
iii. At any position in the list
Method Prototype: public static Node InsAny(Node start)
b) The deletion operation
i. From the beginning of the list
Method Prototype: public static Node DelBeg(Node start)
ii. From the end of the list
Method Prototype: public static Node DelEnd(Node start)
iii. From any position in the list
Method Prototype: public static Node DelAny(Node start)
iv. Deleting a node based on student regd_no. If the specified node is not present
in the list an error message should be displayed. Both the option should be
demonstrated.
c) Search a node based on student regd_no and update the mark of the student. If the
specified node is not present in the list an error message should be displayed.
Method Prototype: public static void search(Node start)
d) Sort the nodes of the linked list according to the mark secured by the student from
higher to lower.
Method Prototype: public static void sort(Node start)
e) Count the number of nodes present in the linked list
Method Prototype: public static int count(Node start)
f) Reverse the linked list
Method Prototype: public static Node reverse(Node start)
g) Displaying all the nodes in the list
The prototype of the display function should be as follows.
public static void display(Node start)*/
import java.util.Scanner;
class Node
{
	protected int regd_no;
	protected float mark;
	protected Node next;
	public Node(int regd_no,float mark)
	{
		this.regd_no=regd_no;
		this.mark=mark;
		this.next=null;
	}
}

public class Q1 
{
	static Node start;
	public static Node create(Node start) 
	{
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter the new node registration number and mark");
		Node newnode=new Node(sc.nextInt(),sc.nextFloat());
		if(start==null)
		{
			start=newnode;
		}
		else
		{
			Node temp=start;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}
		System.out.println("Do you want to insert more(y/n)");
		ch=sc.next().charAt(0);
		}while(ch=='y');
		
		return start;
	}
	
	
	
	public static void display(Node start)
	{
	Node temp=start;
	while(temp!=null)
	{
		System.out.print("("+temp.regd_no+"  "+temp.mark+") ->");
		temp=temp.next;
		}
		System.out.println("null");
	}
	
	
	
	public static Node InsBeg(Node start) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new node registration number and mark");
		Node newnode=new Node(sc.nextInt(),sc.nextFloat());
		newnode.next=start;
		start=newnode;
		
		return start;
	}
	
	
	
	public static Node InsEnd(Node start) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new node registration number and mark");
		Node newnode=new Node(sc.nextInt(),sc.nextFloat());
		if(start==null)
		{
			start=newnode;
		}
		else {
			Node temp=start;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}
		return start;
	}
	
	
	
	public static Node InsAny(Node start) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new node registration number and mark");
		Node newnode=new Node(sc.nextInt(),sc.nextFloat());
		System.out.print("Enter the position in which you want to insert new node:");
		int p=sc.nextInt();
		if(start==null)
		{
			start=newnode;
		}
		else 
		{
			Node temp=start;
			while(temp.next!=null&&p>2)
			{
				temp=temp.next;
				p--;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
		return start;
	}
	
	
	
	public static Node DelBeg(Node start)
	{
		if(start==null)
		{
			System.out.println("Underflow");
			return null;
		}
		System.out.println("Deleted item is:"+"("+start.regd_no+"  "+start.mark+")");
		start=start.next;
		return start;
	}
	
	
	
	public static Node DelEnd(Node start)
	{
		if(start==null||start.next==null)
		{
			return null;
		}
		
		Node temp=start;
		while(temp.next.next!=null)
		{
			temp=temp.next;
		}
		System.out.println("Deleted item is:"+"("+temp.next.regd_no+"  "+temp.next.mark+")");
		temp.next=null;
		return start;
	}
	
	
	
	public static Node DelAny(Node start)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the position in which you want to delete:");
		int p=sc.nextInt();
		if(start==null)
			return null;
		if(p==1)
		{
			System.out.println("Deleted item is:"+"("+start.regd_no+"  "+start.mark+")");
			start=start.next;
			return start;
		}
		Node temp=start;
		while(temp.next!=null&&p>2)
		{
			temp=temp.next;
			p--;
		}
		if(temp.next!=null)
		{
			System.out.println("Deleted item is:"+"("+temp.next.regd_no+"  "+temp.next.mark+")");
			temp.next=temp.next.next;
		}
		return start;
	}
	
	
	
	public static Node Del(Node start)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the student regd_no which you want to delete: ");
		int reg=sc.nextInt();
		Node temp=start;
		Node prev=null;
		while(temp!=null&&temp.regd_no!=reg)
		{
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
			System.out.println("Specified registration number is not present");
		else
		prev.next=temp.next;
		
		return start;
	}
	
	
	public static void search(Node start)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the student regd_no: ");
		int reg=sc.nextInt();
		Node temp=start;
		while(temp!=null)
		{
			if(temp.regd_no==reg)
			{
				System.out.print("Enter the mark:");
				temp.mark=sc.nextFloat();
				break;
			}
			temp=temp.next;
		}
		
		if(temp==null)
			System.out.println("Specified registration number is not present");		
	}
	
	
	public static void sort(Node start) 
	{
		Node temp=start;
		while(temp!=null)
		{
			Node temp1=start;
			while(temp1.next!=null)
			{
				if(temp1.mark<temp.mark)
				{
					float m=temp1.mark;
					temp1.mark=temp.mark;
					temp.mark=m;
					int reg=temp1.regd_no;
					temp1.regd_no=temp.regd_no;
					temp.regd_no=reg;
				}
				temp1=temp1.next;
			}
			temp=temp.next;
		}
	}
	
	
	public static int count(Node start)
	{
		Node temp=start;
		int c=0;
		while(temp!=null)
		{
			c++;
			temp=temp.next;
		}
		return c;
	}
	
	
	public static Node reverse(Node start)
	{
		if(start==null)
			return null;
		
		Node temp=start.next;
		Node current=null;
		while (temp!=null)
		{
			start.next=current;
			current =start;
			start=temp;
			temp=temp.next;
		}
		start.next=current;
		return start;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("****MENU*****");
		System.out.println("0:Exit");
		System.out.println("1:Creation");
		System.out.println("2:Display");
		System.out.println("3:Insert operation at the beginning of the list");
		System.out.println("4:Insert operation at the end of the list");
		System.out.println("5:Insert operation at any position of the list");
		System.out.println("6:Deletion operation from the beginning of the list");
		System.out.println("7:Deletion operation from the end of the list");
		System.out.println("8:Deletion operation From any position in the list");
		System.out.println("9:Delete a node based on student regd_no");
		System.out.println("10:Search a node based on student regd_no");
		System.out.println("11:Sort the list according to the mark in descending order");
		System.out.println("12:Count the number of nodes present in the linked list");
		System.out.println("13:Reverse the linked list");
		
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 0:
			System.exit(0);
		case 1:
			start=create(start);
			break;
		case 2:
			display(start);
			break;
		case 3:
			start=InsBeg(start);
			break;
		case 4:
			start=InsEnd(start);
			break;
		case 5:
			start=InsAny(start);
			break;
		case 6:
			start=DelBeg(start);
			break;	
		case 7:
			start=DelEnd(start);
			break;	
		case 8:
			start=DelAny(start);
			break;	
		case 9:
			start=Del(start);
			break;	
		case 10:
			search(start);
			break;	
		case 11:
			sort(start);
			break;
		case 12:
			int count=count(start);
			System.out.println("Number of nodes: "+count);
			break;
		case 13:
			start=reverse(start);
			break;
		default:
			System.out.println("Wrong choice");
			}
		}
	}
}
