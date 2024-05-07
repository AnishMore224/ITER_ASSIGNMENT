public class Q5 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        Q5 obj = new Q5();
        Node1 root = obj.create(arr, 0, arr.length - 1);
        obj.inorder(root);
    }

    public Node1 create(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node1 curr = new Node1(arr[mid]);
        curr.left = create(arr, start, mid - 1);
        curr.right = create(arr, mid + 1, end);
        return curr;
    }

    public void inorder(Node1 root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}

class Node1 {
    int val;
    Node1 left;
    Node1 right;

    Node1(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

/*
 * Output--
 * 10 20 30 40 50 60 70 80 90 100
 */