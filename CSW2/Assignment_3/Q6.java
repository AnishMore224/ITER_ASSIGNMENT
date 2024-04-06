public class Q6 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(null);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("End of program");
    }

}

/*
 * Output:
 * java.lang.NumberFormatException: Cannot parse null string
 * End of program
 */