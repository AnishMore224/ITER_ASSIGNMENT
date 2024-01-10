/*
 Name:Anish More
 Registraion Number: 2241013365
 Name of program:Stack using Linked List
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

public class Q1 {

    Node top = null;

    void push(Node newNode) {
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }

    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
        }
        System.out.println("Deleted item is: " + top.data);
        top = top.next;
    }

    void display() {
        if (top == null)
            System.out.println("No element in stack");
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q1 obj = new Q1();
        while (true) {
            System.out.println("\n****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter the data:");
                    Node newNode = new Node(sc.nextInt());
                    obj.push(newNode);
                    break;
                case 2:
                    obj.pop();
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
 ****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice:1
Enter the data:1

****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice:1
Enter the data:2

****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice:1
Enter the data:3

****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice:3
3  2  1
****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice:2
Deleted item is: 3

****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice:3
2  1
****MENU****
0:Exit
1:Push
2:Pop
3:Display
Enter your choice:0
 */