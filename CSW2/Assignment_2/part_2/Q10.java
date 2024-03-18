import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        Hashtable<String, Integer> ht = new Hashtable<>();
        int max = 0;
        ArrayList<String> ob = new ArrayList<>();
        for (String i : arr) {
            // if (!ht.containsKey(i)) {
            // ht.put(i, 1);
            // } else {
            // ht.put(i, ht.get(i) + 1);
            // }
            ht.put(i, ht.getOrDefault(i, 0) + 1);
            if (ht.get(i) > max) {
                max = ht.get(i);
                ob.clear();
            }
            if (ht.get(i) == max) {
                ob.add(i);
            }

        }
        System.out.println(ob + " appears maximum times.");
    }
}

/*
 * Output--
 * Enter string:hello how are you hello anish , i am anish
 * [hello, anish] appears maximum times.
 */