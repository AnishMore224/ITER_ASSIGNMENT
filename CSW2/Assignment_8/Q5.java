
//Write a program that reads a list of strings, converts them to uppercase, filters out the strings starting with a vowel, and then prints the remaining strings.
import java.util.*;

class Q5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry",
                "fig", "grape", "honeydew", "kiwi", "lemon"));
        list.replaceAll(s -> s.toUpperCase());
        list.forEach((String s) -> {
            if ("AEIOU".indexOf(s.charAt(0)) == -1) {
                System.out.println(s);
            }
        });

    }
}
