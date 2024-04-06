import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean b = false;
        try {
            int len = s.length();

            for (int i = 1; i < len; i++) {
                if (Character.isDigit(s.charAt(i)) && Character.isLetter(s.charAt(i - 1))) {
                    System.out.print(s.charAt(i) + "  ");
                    b = true;
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        if (!b) {
            System.out.println("Not Found");
        }
    }
}

/*
 * Output:
 * ab12cd35
 * 1 3
 */