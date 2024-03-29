import java.util.*;

class SeparateAddressing {
    Node arr[];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SeparateAddressing ob = new SeparateAddressing();
        ob.create();
        ob.display();
        ob.search();
        ob.delete();
        ob.display();

    }

    void create() {

        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        arr = new Node[n];
        System.out.print("Enter elements:");
        for (int i = 0; i < n; i++) {
            Node num = new Node(sc.nextInt());
            int h = num.data % n;
            num.next = arr[h];
            arr[h] = num;
        }
    }

    void display() {
        System.out.println("HashTable data--");
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] != null) {
                System.out.print("Key: " + i + "\tValue: ");
                Node temp = arr[i];
                while (temp != null) {
                    System.out.print(temp.data + "  ");
                    temp = temp.next;
                }
                System.out.println();
            }

        }
    }

    void search() {
        System.out.print("Enter value to search: ");
        int num = sc.nextInt(), len = arr.length;
        if (arr[num % len] != null) {
            Node temp = arr[num % len];
            while (temp != null) {
                if (temp.data == num) {
                    System.out.println("Found at key: " + (num % len));
                    return;
                }
                temp = temp.next;
            }
        }

        System.out.println("Not Found");
    }

    void delete() {
        System.out.print("Enter value to delete: ");
        int num = sc.nextInt(), len = arr.length;
        int i = num % len;
        Node temp, prev;
        if (arr[i] != null) {
            if (arr[i].data == num) {
                arr[i] = arr[i].next;
                System.out.println("Deleted");
                return;
            }
            prev = arr[i];
            temp = arr[i].next;
            while (temp != null) {
                if (temp.data == num) {
                    prev.next = temp.next;
                    return;
                }
                prev = temp;
                temp = temp.next;
            }
        }
        System.out.println("Not Found");
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
