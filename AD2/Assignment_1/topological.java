package Assignment_1;

import java.util.ArrayList;
import java.util.Scanner;

class topological {
    static boolean b[];
    static ArrayList<ArrayList<Integer>> ob;
    static ArrayList<Integer> order;

    public static void main(String[] args) {
        ob = new ArrayList<>();
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
        b = new boolean[n];
        order = new ArrayList<>();
        b[0] = true;
        dfs(0);
        System.out.print("Topological order of graph is:");
        for (int i : order) {
            System.out.print(i + " ");
        }
    }

    public static void dfs(int n) {

        for (int i : ob.get(n)) {
            if (!b[i]) {
                b[i] = true;
                dfs(i);
            }
        }
        order.add(0, n);
    }
}
/*
 * Output--
 * 
 * Enter no of nodes:8
 * Enter no. of adjacent nodes of 0:3
 * 1 2 3
 * Enter no. of adjacent nodes of 1:1
 * 4
 * Enter no. of adjacent nodes of 2:1
 * 5
 * Enter no. of adjacent nodes of 3:1
 * 6
 * Enter no. of adjacent nodes of 4:1
 * 7
 * Enter no. of adjacent nodes of 5:1
 * 7
 * Enter no. of adjacent nodes of 6:1
 * 7
 * Enter no. of adjacent nodes of 7:0
 * Topological order of graph is:0 3 6 2 5 1 4 7
 */