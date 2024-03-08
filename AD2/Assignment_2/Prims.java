package Assignment_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Prims {
    public static void main(String[] args) {
        int w[][] = { { 0, 10, 0, 0, 25, 0, 0 }, { 10, 0, 28, 0, 0, 0, 0 }, { 0, 28, 0, 16, 0, 14, 0 },
                { 0, 0, 16, 0, 0, 0, 12 }, { 25, 0, 0, 0, 0, 24, 26 }, { 0, 0, 14, 0, 24, 0, 18 },
                { 0, 0, 0, 12, 26, 18, 0 } };

        ArrayList<ArrayList<Integer>> ob = new ArrayList<>();
        ob.add(new ArrayList<>(Arrays.asList(1, 4)));
        ob.add(new ArrayList<>(Arrays.asList(0, 2)));
        ob.add(new ArrayList<>(Arrays.asList(1, 3, 5)));
        ob.add(new ArrayList<>(Arrays.asList(2, 6)));
        ob.add(new ArrayList<>(Arrays.asList(0, 5, 6)));
        ob.add(new ArrayList<>(Arrays.asList(2, 4, 6)));
        ob.add(new ArrayList<>(Arrays.asList(3, 4, 5)));
        
        Vertex[] v1 = new Vertex[7];
        for (int j = 0; j < 7; j++) {
            v1[j] = new Vertex(j, -1, Integer.MAX_VALUE);
        }
        v1[0].key = 0;
        int u;
        PriorityQueue<Vertex> pq = new PriorityQueue<>();
        for (int i = 0; i < 7; i++) {
            pq.add(v1[i]);
        }

        while (!pq.isEmpty()) {
            u = pq.poll().val;
            for (int v : ob.get(u)) {
                if (pq.contains(v1[v]) && w[u][v] < v1[v].key) {
                    pq.remove(v1[v]);
                    v1[v].key = w[u][v];
                    v1[v].predecessor = u;
                    pq.add(v1[v]);
                }
            }
        }

        System.out.println("Minimum Spanning Tree: ");
        System.out.println("Edge \tWeight");
        for (int i = 1; i < 7; i++) {
            System.out.println(i + "" + v1[i].predecessor + "\t" + v1[i].key);
        }
    }

}

class Vertex implements Comparable<Vertex> {
    int predecessor;
    int key;
    int val;

    public Vertex(int val, int pred, int key) {
        this.val = val;
        this.predecessor = pred;
        this.key = key;
    }

    public int compareTo(Vertex other) {
        return this.key - other.key;
    }
}

/*
 * Output--
 * Minimum Spanning Tree:
 * Edge     Weight
 * 10       10
 * 25       14
 * 32       16
 * 40       25
 * 54       24
 * 63       12
 */