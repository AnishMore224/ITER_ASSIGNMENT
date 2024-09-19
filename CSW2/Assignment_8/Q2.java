//Write a program that sorts a list of strings based on their lengths in descending order. Define a custom comparator using a lambda expression that compares strings based on their lengths. Use the custom comparator to sort the list of strings in descending order of length.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry",
                "fig", "grape", "honeydew", "kiwi", "lemon"));
        Collections.sort(list, (String a, String b) -> {
            return b.length() - a.length();
        });
        System.out.println(list);
    }

}