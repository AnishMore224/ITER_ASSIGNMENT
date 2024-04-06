import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        try {
            if (a % (Math.PI / 2) < 1E-5) {
                throw new ArithmeticException("x is very close to multiple of PI/2");
            }
            System.out.println((Math.sin(a) + Math.cos(a)) / Math.tan(a));
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