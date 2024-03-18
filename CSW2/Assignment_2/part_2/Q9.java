import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> rpt = new HashSet<>();
        for (int i : arr) {
            if (hs.contains(i)) {
                rpt.add(i);
            }
            hs.add(i);
        }
        System.out.println(rpt + " are repeated numbers.");
    }
}

/*
 * Output--
 * Enter no. of elements:7
 * 1 3 1 6 6 4 5
 * [1, 6] are repeated numbers.
 */