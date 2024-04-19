public class Q1 {
    public static void main(String[] args) {
        System.gc();
        String s = new String("Hello");
        System.out.println("Memory available when new is used:" + Runtime.getRuntime().freeMemory());
        String s3 = new String("Hello");
        System.gc();
        String s1 = "Hello";
        System.out.println("Memory available without using new:" + Runtime.getRuntime().freeMemory());
        String s2 = "Hello";
        System.out.println(s1 == s2);
        System.out.println(s == s1);
        System.out.println(s == s3);
    }
}

/*
 * Output--
 * Memory available when new is used:7604360
 * Memory available without using new:7768048
 * true
 * false
 * false
 */