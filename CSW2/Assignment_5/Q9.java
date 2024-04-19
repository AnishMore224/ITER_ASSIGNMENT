import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter two words");
        String word1 = sc.next();
        String word2 = sc.next();
        int n = s.indexOf(word1);
        System.out.println("First occurrence of " + word1 + " is at index " + n);
        int n2 = s.indexOf(word2);
        System.out.println("Modified String: " + (s.substring(0, n2) + s.substring(word2.length() + n2)));

    }
}
/*
 * Output--
 * Enter the string:
 * Hello my name is anish
 * Enter two words
 * my
 * is
 * First occurrence of my is at index 6
 * Modified String: Hello my name anish
 */