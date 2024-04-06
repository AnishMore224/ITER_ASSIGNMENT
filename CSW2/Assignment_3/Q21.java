public class Q21 {
    public static void main(String[] args) {
        int arr[][] = { { 1 }, { 2 }, { 3 } };
        int arr1[][] = { { 1 }, { 2 }, { 3 } };
        try {
            int arr2[][] = new int[3][1];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    arr2[i][j] = arr[i][j] + arr1[i][j];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
/*
 * Output--
 * java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
 */
