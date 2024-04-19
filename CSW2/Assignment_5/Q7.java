import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s1 = sc.next();
        System.out.println("Enter the character to search:");
        char c = sc.next().charAt(0);
        char ch[] = s1.toCharArray();
        System.out.println("First occurrence of " + c + " is at index " + s1.indexOf(c));
        System.out.println("Last occurrence of " + c + " is at index " + s1.lastIndexOf(c));
        System.out.println(Arrays.toString(ch));

    }
}
/*
 * Output--
 * Enter the string:hello
 * Enter the character to search:
 * l
 * First occurrence of l is at index 2
 * Last occurrence of l is at index 3
 * [h, e, l, l, o]
 */