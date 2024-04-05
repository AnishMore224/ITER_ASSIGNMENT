import java.util.*;

public class huffmanEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        huffmanEncoding obj = new huffmanEncoding();
        PriorityQueue<Node> ob = new PriorityQueue<>();
        System.out.print("Enter number of characters:");
        int len = sc.nextInt();
        System.out.println("Enter characters and frequency:");
        for (int i = 0; i < len; i++) {
            ob.offer(new Node(sc.next().charAt(0), sc.nextInt()));
        } 
        char temp = '*';
        while (ob.size() != 1) {
            Node a = ob.poll();
            Node b = ob.poll();
            Node n = new Node(temp, a.f + b.f);
            n.left = a;
            n.right = b;
            ob.add(n);
        }
        System.out.println("Huffman Encoding--");
        obj.display(ob.poll(), "");
    }

    void display(Node root, String s) {
        if (root == null) {
            return;
        }
        if (root.ch >= 65 && root.ch <= 90) {
            System.out.println(root.ch + ":" + s);
        }
        display(root.left, s + "0");
        display(root.right, s + "1");
    }
}

class Node implements Comparable<Node> {
    char ch;
    int f;
    Node left, right;

    Node(char ch, int f) {
        this.ch = ch;
        this.f = f;
        this.left = null;
        this.right = null;
    }

    public int compareTo(Node temp) {
        return this.f - temp.f;
    }
}