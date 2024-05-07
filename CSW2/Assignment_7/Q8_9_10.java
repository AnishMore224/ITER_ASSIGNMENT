import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Q8_9_10 {
    private int v;
    private LinkedList<Integer>[] adj;
    private int[][] adj1;
    boolean[] visited;

    Q8_9_10(int v) {
        this.v = v;
        this.adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        adj1 = new int[v][v];
        visited = new boolean[v];
    }

    public static void main(String[] args) {
        Q8_9_10 a = new Q8_9_10(5);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of edges:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.addEdge(sc.nextInt(), sc.nextInt());
        }
        a.display();
        System.out.println("DFS Traversal--");
        a.dfs(0);
        a.visited[0] = true;
        System.out.println("\nBFS Traversal");
        a.visited = new boolean[n];
        a.bfs(0);

    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        adj1[u][v] = 1;
        adj1[v][u] = 1;
    }

    public void display() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < v; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(adj1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dfs(int s) {
        Stack<Integer> q = new Stack<>();
        q.push(s);
        while (!q.isEmpty()) {
            int u = q.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        q.push(v);
                    }
                }
            }
        }
    }

    public void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    q.offer(v);
                    visited[v] = true;
                }
            }
        }
    }

}

/*
 * Output--
 * Enter no. of edges:5
 * 0 1
 * 1 2
 * 2 3
 * 0 3
 * 2 4
 * Adjacency List:
 * Vertex 0: 1 3
 * Vertex 1: 0 2
 * Vertex 2: 1 3 4
 * Vertex 3: 2 0
 * Vertex 4: 2
 * Adjacency Matrix:
 * 0 1 0 1 0
 * 1 0 1 0 0
 * 0 1 0 1 1
 * 1 0 1 0 0
 * 0 0 1 0 0
 * DFS Traversal--
 * 0 3 2 4 1
 * BFS Traversal
 * 0 1 3 2 4
 */