import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> ob = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            ob.put(i, -1);
        }
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ob.put(a[i], i);
        }
        int min = 10;
        for (int i : ob.keySet()) {
            if (ob.get(i) == -1 && min > i) {
                min = i;
            }
        }
        System.out.println("Smallest missing number:" + min);
    }
}

/*
 * Output--
 * Enter no. of elements: 7
 * 2 5 7 3 1 9 10
 * Smallest missing number:4
 */