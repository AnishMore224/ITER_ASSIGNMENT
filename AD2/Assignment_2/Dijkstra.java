
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {
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

        Vertex1[] v1 = new Vertex1[7];
        for (int j = 0; j < 7; j++) {
            v1[j] = new Vertex1(j, -1, Integer.MAX_VALUE);
        }
        v1[0].distance = 0;
        int u;
        PriorityQueue<Vertex1> pq = new PriorityQueue<>();
        for (int i = 0; i < 7; i++) {
            pq.add(v1[i]);
        }

        while (!pq.isEmpty()) {
            u = pq.poll().val;
            for (int v : ob.get(u)) {
                if (w[u][v] + v1[u].distance < v1[v].distance) {
                    pq.remove(v1[v]);
                    v1[v].distance = w[u][v] + v1[u].distance;
                    v1[v].predecessor = u;
                    pq.add(v1[v]);
                }
            }
        }

        System.out.println("Minimum Spanning Tree: ");
        System.out.println("Vertex \tDistance from source");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + "" + "\t" + v1[i].distance);
        }
    }

}

class Vertex1 implements Comparable<Vertex1> {
    int predecessor;
    int distance;
    int val;

    public Vertex1(int val, int pred, int distance) {
        this.val = val;
        this.predecessor = pred;
        this.distance = distance;
    }

    public int compareTo(Vertex1 other) {
        return this.distance - other.distance;
    }
}

/*
 * Output--
 * Minimum Spanning Tree:
 * Vertex   Distance from source
 * 0            0
 * 1            10
 * 2            38
 * 3            54
 * 4            25
 * 5            49
 * 6            51
 */