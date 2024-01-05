package Assignment_9;

import java.util.Scanner;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Q1 {
    TreeNode root = null;

    public void create(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) {
            root = insert(root, arr[i]);
        }
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val >= val) {
            root.left = insert(root.left, val);
        }
        if (root.val < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in BST:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Q1 obj = new Q1();
        obj.create(arr);
        System.out.println("InOrder--");
        obj.inorder(obj.root);
        System.out.println("\nPreOrder--");
        obj.preorder(obj.root);
        System.out.println("\nPostOrder--");
        obj.postorder(obj.root);
        System.out.println("\nPreOrder Iterative--");
        obj.preorder_iterative(obj.root);
    }
}
