import java.util.*;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
/*
 * Output:
 * A
 * java.util.InputMismatchException
 * End of program
 */