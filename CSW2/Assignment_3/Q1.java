public class Q1 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("End of Program");
    }
}
/*
 * java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
 * at Q1.main(Q1.java:5)
 * End of Program
 */