/*
 Name:Anish More
 Registraion Number: 2241013365
 Name of program:Queue using Linked List
 */

package Assignment_10;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q2 {

    Node front = null, rear = null;

    void Enqueue(Node newNode) {
        if (front == null || rear == null) {
            front = newNode;
            rear = newNode;
        }
        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
        }
        System.out.println("Deleted item is: " + front.data);
        front = front.next;
        if (front == null)
            rear = null;
    }

    void display() {
        if (front == null)
            System.out.println("No element in Queue");
        else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q2 obj = new Q2();
        while (true) {
            System.out.println("\n****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Insert");
            System.out.println("2:Delete");
            System.out.println("3:Display");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter the data:");
                    Node newNode = new Node(sc.nextInt());
                    obj.Enqueue(newNode);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.display();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
/*
 **** MENU****
 * 0:Exit
 * 1:Insert
 * 2:Delete
 * 3:Display
 * Enter your choice:1
 * Enter the data:1
 **** MENU****
 * 0:Exit
 * 1:Insert
 * 2:Delete
 * 3:Display
 * Enter your choice:1
 * Enter the data:2
 **** MENU****
 * 0:Exit
 * 1:Insert
 * 2:Delete
 * 3:Display
 * Enter your choice:1
 * Enter the data:3
 **** MENU****
 * 0:Exit
 * 1:Insert
 * 2:Delete
 * 3:Display
 * Enter your choice:3
 * 1 2 3
 **** MENU****
 * 0:Exit
 * 1:Insert
 * 2:Delete
 * 3:Display
 * Enter your choice:2
 * Deleted item is: 1
 **** 
 * MENU****
 * 0:Exit
 * 1:Insert
 * 2:Delete
 * 3:Display
 * Enter your choice:3
 * 2 3
 **** MENU****
 * 0:Exit
 * 1:Insert
 * 2:Delete
 * 3:Display
 * Enter your choice:0
 */