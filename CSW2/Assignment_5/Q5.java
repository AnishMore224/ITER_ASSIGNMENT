import java.util.GregorianCalendar;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer();
        StringBuilder str1 = new StringBuilder();
        System.out.print("Enter the base string:");
        String s = sc.next();
        System.out.print("Enter number of concatenations:");
        int n = sc.nextInt();

        runStringBuilder(str1, s, n);
        runStringBuffer(str, s, n);
    }

    public static void runStringBuilder(StringBuilder str, String s, int n) {
        long begin = new GregorianCalendar().getTimeInMillis();
        for (int i = 0; i < n; i++) {
            str.append(s);
        }
        System.out.println("String Builder");
        System.out.println("Time:" + (new GregorianCalendar().getTimeInMillis() - begin) + "ms");
        System.out.println("Final String Length: " + str.length());
    }

    public static void runStringBuffer(StringBuffer str, String s, int n) {
        long begin = new GregorianCalendar().getTimeInMillis();

        for (int i = 0; i < n; i++) {
            str.append(s);
        }
        System.out.println("String Buffer");
        System.out.println("Time:" + (new GregorianCalendar().getTimeInMillis() - begin) + "ms");
        System.out.println("Final String Length: " + str.length());
    }
}

/*
 * Output--
 * Enter the base string:hello
 * Enter number of concatenations:10000
 * String Builder
 * Time:13ms
 * Final String Length: 50000
 * String Buffer
 * Time:6ms
 * Final String Length: 50000
 */