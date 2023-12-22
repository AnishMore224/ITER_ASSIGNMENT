
/*Name: Anish More
 Registration Number:2241013365
 Name of program: Doubly Linked List
 */
package Assignment_8;

import java.util.Scanner;

public class Q1 {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static void create() {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter data:");
            int data = sc.nextInt();
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                newnode.prev = tail;
                tail = newnode;
            }
            System.out.println("Do you want to insert more(y/n)");
            ch = sc.next().charAt(0);
        } while (ch == 'y');
    }

    public static void InsBeg(Node n) {
        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }
    }

    public static void InsEnd(Node n) {
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    public static void InsAny(Node newnode, int p) {
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            Node temp = head;
            while (temp.next != null && p > 2) {
                temp = temp.next;
                p--;
            }
            newnode.next = temp.next;
            newnode.prev = temp;
            if (temp.next != null)
                temp.next.prev = newnode;
            temp.next = newnode;
        }
    }

    public static void DelBeg() {
        if (head == null || head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public static void DelEnd() {
        if (head == null || head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public static void DelAny(int p) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next != null && p > 2) {
                temp = temp.next;
                p--;
            }
            if (temp.next == null) {
                System.out.println("Invalid position");
            } else {
                temp.next = temp.next.next;
                temp.next.prev = temp;
            }
        }
    }

    public static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
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
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            Node data;
            switch (choice) {
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
                    data=new Node(sc.nextInt());
                    InsBeg(data);
                    break;
                case 4:
                    System.out.println("Enter the data");
                    data=new Node(sc.nextInt());
                    InsEnd(data);
                    break;
                case 5:
                    System.out.println("Enter the data");
                    data=new Node(sc.nextInt());
                    System.out.println("Enter the position");
                    int p = sc.nextInt();
                    InsAny(data, p);
                    break;
                case 6:
                    DelBeg();
                    break;
                case 7:
                    DelEnd();
                    break;
                case 8:
                    System.out.println("Enter the position");
                    p = sc.nextInt();
                    DelAny(p);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
