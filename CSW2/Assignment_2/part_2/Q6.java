package part_2;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> st = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            st.add(sc.nextInt());
        }
        System.out.print("TreeSet Data : ");
        Iterator<Integer> itr = st.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nEnter Number to search:");
        int n = sc.nextInt();
        System.out.println(n + " is present: " + st.contains(n));
        System.out.println("Enter an element to delete");
        st.remove(sc.nextInt());
        System.out.println("After Deletion :" + st);

    }
}
/*
 * Enter 5 elements:2 4 7 1 3
 * TreeSet Data : 1 2 3 4 7
 * Enter Number to search:
 * 3
 * 3 is present: true
 * Enter an element to delete
 * 4
 * After Deletion :[1, 2, 3, 7]
 */