import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if (n < 0) {
                throw new ArithmeticException("Square of negative number cannot be found");
            }
            System.out.println(Math.sqrt(n));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}

/*
 * Output:
 * -12
 * java.lang.ArithmeticException: Square of negative number cannot be found
 * End of Program
 */