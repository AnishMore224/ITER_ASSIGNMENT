import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        boolean b = false;
        Scanner sc = new Scanner(System.in);
        while (!b) {
            try {
                String s = sc.next();
                int n = Integer.parseInt(s);
                b = true;
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        System.out.println("End of Program");
    }
}

/*
 * Output:
 * AB
 * java.lang.NumberFormatException: For input string: "AB"
 * 12
 * End of Program
 */