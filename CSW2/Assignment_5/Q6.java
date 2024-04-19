import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();
        String s1Upper = s1.toUpperCase();
        String s2Upper = s2.toUpperCase();
        System.out.println("s1: " + s1 + "\ts2: " + s2);
        System.out.println("s1Upper: " + s1Upper + "\ts2Upper: " + s2Upper);
        System.out.println(s1.compareToIgnoreCase(s1Upper));
        System.out.println(s2.compareToIgnoreCase(s2Upper));
    }
}

/*
 * Output--
 * hello
 * anish
 * s1: hello s2: anish
 * s1Upper: HELLO s2Upper: ANISH
 * 0
 * 0
 */
