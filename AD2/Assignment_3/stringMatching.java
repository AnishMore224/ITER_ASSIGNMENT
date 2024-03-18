// package Assignment_3;

import java.util.*;

public class stringMatching {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder();
        String text = "abcdhabcbd";
        StringBuilder pattern = new StringBuilder("abc");
        int n = text.length(), m = pattern.length();
        for (int i = 0; i < m - 1; i++) {
            sb1.append(text.charAt(i));
        }

        for (int i = 0; i < n - m; i++) {
            sb1.append(text.charAt(i + m - 1));
            if (sb1.compareTo(pattern) == 0) {
                ob.add(i);
            }
            sb1.delete(0, 1);
        }
        System.out.println("The pattern is found at index: " + ob);

        // ArrayList<Integer> ob = new ArrayList<>();
        // String text = "abcdhabcbd";
        // String pattern = "abc";
        // int n = text.length(), m = pattern.length();
        // for (int i = 0; i < n - m; i++) {
        // if (pattern.equals(text.substring(i, i + m))) {
        // ob.add(i);
        // }
        // }
        // System.out.println("The pattern is found at index: " + ob);
    }
}

/*
 * 
 */