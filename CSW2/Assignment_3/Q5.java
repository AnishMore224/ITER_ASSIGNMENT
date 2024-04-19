import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = null;
        try {
            System.out.println(n + 2);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}

/*
 * Output:
 * java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()"
 * because "n" is null
 * End of Program
 */