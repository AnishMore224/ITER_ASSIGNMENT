import java.lang.reflect.Array;
import java.util.*;

class TreeNode {
    int info;
    TreeNode left;
    TreeNode right;

    public TreeNode(int info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
}

public class Q1_2 {
    TreeNode root = null;

    public TreeNode create(int arr[]) {
        for (int i : arr) {
            root = insert(root, i);
        }
        return root;
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.info >= val) {
            root.left = insert(root.left, val);
        }
        if (root.info < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.info + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.info + " ");
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.info + " ");
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
        Q1_2 obj = new Q1_2();
        obj.root = obj.create(arr);
        System.out.println("InOrder--");
        obj.inorder(obj.root);
        System.out.println("\nPreOrder--");
        obj.preorder(obj.root);
        System.out.println("\nPostOrder--");
        obj.postorder(obj.root);
    }
}
/*
 * Output--
 * Enter the number of elements in BST:
 * 6
 * Enter elements :
 * 8 3 1 5 2 7
 * InOrder--
 * 1 2 3 5 7 8
 * PreOrder--
 * 8 3 1 2 5 7
 * PostOrder--
 * 2 1 7 5 3 8
 */