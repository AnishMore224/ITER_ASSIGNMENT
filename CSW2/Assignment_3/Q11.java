import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        try {
            if (a < 0 || a % (Math.PI / 4) < 1E-5) {
                throw new ArithmeticException("Denominator can't be Zero or log of negative numbers can't be found");
            }
            System.out.println(Math.log(Math.sin(a) + Math.cos(a)) / (Math.tan(a) - (1 / Math.tan(a))));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

/*
 * Output---
 * 0.7853981634
 * java.lang.ArithmeticException: Denominator can't be Zero
 */