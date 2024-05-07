//Determine if a given binary tree is a binary search tree. You will use an 'isBST()' method, which takes the maximum and minimum range of the values of the nodes.

import java.util.LinkedList;
import java.util.Queue;

public class Q6 {
    TreeNode1 root = null;

    public static void main(String[] args) {
        int arr[] = { 4, 2, 5, 1, 3 };
        Q6 obj = new Q6();
        obj.createBinaryTree(arr);
        System.out.println("Is it BST: "+obj.isBST(obj.root, Integer.MIN_VALUE,
        Integer.MAX_VALUE));
        
    }

    public boolean isBST(TreeNode1 root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.info < min || root.info > max) {
            return false;
        }
        return isBST(root.left, min, root.info) && isBST(root.right, root.info, max);
    }

    public void createBinaryTree(int arr[]) {
        if (arr == null || arr.length == 0)
            return;
    
        root = new TreeNode1(arr[0]);
        Queue<TreeNode1> q = new LinkedList<>();
        q.offer(root);
    
        for (int i = 1; i < arr.length; i++) {
            TreeNode1 parent = q.poll();
    
            if (arr[i] != -1) {
                parent.left = new TreeNode1(arr[i]);
                q.offer(parent.left);
            }
    
            if (++i < arr.length && arr[i] != -1) {
                parent.right = new TreeNode1(arr[i]);
                q.offer(parent.right);
            }
        }
    }
    

}

class TreeNode1 {
    int info;
    TreeNode1 left, right;

    TreeNode1(int info) {
        this.info = info;
        left = right = null;
    }
}

/*
 * Output--
 * Is it BST: true
 */