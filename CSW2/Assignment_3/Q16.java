public class Q16 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
/*
 * Output:
 * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
 * End of program
 */