public class Q27 {
    public static void main(String[] args) {
        try {
            Object obj = 5;
            System.out.println((String) obj);
        } catch (ClassCastException e) {
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
/*
 * Output:
 * java.lang.ClassCastException: class java.lang.Integer cannot be cast to class
 * java.lang.String (java.lang.Integer and java.lang.String are in module
 * java.base of loader 'bootstrap')
 * End of program
 */