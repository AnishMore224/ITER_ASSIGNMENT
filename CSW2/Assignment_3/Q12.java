import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        try {
            if (a < 0 && Math.abs(a) % (Math.PI / 4) < 1E-5) {
                throw new ArithmeticException("Denominator can't be Zero");
            }
            System.out.println(Math.sqrt(Math.abs(Math.sin(a) * Math.cos(a))) / (Math.tan(a) + 1));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

/*
 * Output---
 * 0.000000011
 * java.lang.ArithmeticException: x is very close to multiple of PI/2
 */