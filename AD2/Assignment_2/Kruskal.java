package Assignment_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Kruskal {
    public static void main(String[] args) {
        Edge e[] = new Edge[9];
        e[0] = new Edge(0, 1, 10);
        e[1] = new Edge(1, 2, 28);
        e[2] = new Edge(2, 3, 16);
        e[3] = new Edge(3, 6, 12);
        e[4] = new Edge(4, 6, 26);
        e[5] = new Edge(0, 4, 25);
        e[6] = new Edge(5, 4, 24);
        e[7] = new Edge(5, 2, 14);
        e[8] = new Edge(5, 6, 18);

        Arrays.sort(e);
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            al.add(new ArrayList<>(Arrays.asList(i)));
        }
        System.out.println("Edges in the minimum spanning tree: ");
        for (int i = 0; i < 9; i++) {
            int find_u = find(e[i].u, al);
            int find_v = find(e[i].v, al);
            if (find_u != find_v) {
                System.out.println(e[i].u + "" + e[i].v);
                al.get(find_u).addAll(al.get(find_v));
                al.get(find_v).clear();
            }
        }
    }

    public static int find(int u, ArrayList<ArrayList<Integer>> al) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).contains(u)) {
                return i;
            }
        }
        return -1;
    }
}

class Edge implements Comparable<Edge> {
    int u, v;
    int weight;

    public Edge(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }
}

/*
 * Edges in the minimum spanning tree:
 * 01
 * 36
 * 52
 * 23
 * 54
 * 04
 */