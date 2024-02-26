package Assignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs_traversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ob = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of nodes:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ob.add(new ArrayList<>());
            System.out.print("Enter no. of adjacent nodes of " + i + ":");
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                ob.get(i).add(sc.nextInt());
            }
        }
        boolean b[] = new boolean[8];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        b[0] = true;
        System.out.print("BFS Traversal of graph is:");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int i : ob.get(node)) {
                if (!b[i]) {
                    q.offer(i);
                    b[i] = true;
                }
            }
        }
    }
}
/*
 * Output--
 * Enter no of nodes:8
 * Enter no. of adjacent nodes of 0:3
 * 1 2 3
 * Enter no. of adjacent nodes of 1:2
 * 0 4
 * Enter no. of adjacent nodes of 2:2
 * 0 5
 * Enter no. of adjacent nodes of 3:2
 * 0 6
 * Enter no. of adjacent nodes of 4:2
 * 1 7
 * Enter no. of adjacent nodes of 5:2
 * 2 7
 * Enter no. of adjacent nodes of 6:2
 * 3 7
 * Enter no. of adjacent nodes of 7:3
 * 4 5 6
 * BFS Traversal of graph is:0 1 2 3 4 5 6 7
 */