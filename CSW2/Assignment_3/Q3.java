public class Q3 {
    public static void main(String[] args) {
        String s = null;
        try {
            if (s == null) {
                throw new CustomNullPointerException("String is null");
            }
        } catch (CustomNullPointerException e) {
            System.out.println(e);
        }
    }
}

class CustomNullPointerException extends Exception {
    CustomNullPointerException(String s) {
        super(s);
    }
}

/*
 * Output:
 * CustomNullPointerException: String is null
 */