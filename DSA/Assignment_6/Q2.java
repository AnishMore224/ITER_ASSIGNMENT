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
