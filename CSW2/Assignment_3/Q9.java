import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) {
                throw new ArithmeticException("Number cannot be divisible by zero");
            }
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}

/*
 * Output:
 * 2 0
 * java.lang.ArithmeticException: Number cannot be divisible by zero
 * End of Program
 */