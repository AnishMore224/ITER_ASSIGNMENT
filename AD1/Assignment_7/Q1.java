/*Name-Anish More
 Registration Number-2241013365
 Name Of the program-
Linked list
1. Create
2. Insertion (at any position including start and end)
3. Delete (at any position including start and end)
4. Traversal
5. Reverse*/

import java.util.Scanner;

public class Q1
{
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    static Node head;
	public static void create() 
	{
		char ch;
        head=null;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter the data");
		Node newnode=new Node(sc.nextInt());
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}
		System.out.println("Do you want to insert more(y/n)");
		ch=sc.next().charAt(0);
		}while(ch=='y');
	}
	
	
	
	public static void display() 
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
	
	
	public static void InsBeg(int data) 
    {
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
	
	
	public static void InsEnd(int data) 
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
	

	public static void InsAny(int data, int p) 
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null&&p>2)
            {
                temp=temp.next;
                p--;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }

	
	public static void DelBeg() 
    {
        if(head==null)
        {
            System.out.println("Underflow");
        }
        else
        {
            head=head.next;
        }
    }

	
	public static void DelEnd() 
    {
        if(head==null||head.next==null)
        {
            head=null;
        }
        else
        {
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    }
	
	public static void DelAny(int p)
	{
        if(head==null)
        {
            return;
        }
        else if(p==1)
        {
            head=head.next;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null&&p>2)
            {
                temp=temp.next;
                p--;
            }
            if(temp.next!=null)
            {
                temp.next=temp.next.next;
            }
        }
    }
	
	
	public static void search(int data)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                System.out.println("Element found");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Element not found");
    }
	
	
	public static void reverse()
    {
        Node temp=head;
        Node prev=null;
        Node next=null;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
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
		System.out.println("3:Insert at beginning");
		System.out.println("4:Insert at the end");
		System.out.println("5:Insert at any position");
		System.out.println("6:Deletion from beginning");
		System.out.println("7:Deletion from end");
		System.out.println("8:Deletion from any position");
		System.out.println("9:Search a node based on data");
		System.out.println("10:Reverse the linked list");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 0:
			System.exit(0);
		case 1:
            create();
			break;
		case 2:
			display();
			break;
		case 3:
			System.out.println("Enter the data");
            int data=sc.nextInt();
            InsBeg(data);
			break;
		case 4:
			System.out.println("Enter the data");
            data=sc.nextInt();
            InsEnd(data);
			break;
		case 5:
			System.out.println("Enter the data");
            data=sc.nextInt();
            System.out.println("Enter the position");
            int p=sc.nextInt();
            InsAny(data,p);
			break;
		case 6:
			DelBeg();
			break;	
		case 7:
            DelEnd();
			break;	
		case 8:
			System.out.println("Enter the position");
            p=sc.nextInt();
            DelAny(p);
			break;	
		case 9:
			System.out.println("Enter the data");
            data=sc.nextInt();
            search(data);
			break;	
		case 10:
			reverse();
			break;	
		default:
			System.out.println("Wrong choice");
			}
		}
	}
}