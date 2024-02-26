
/*Name:Anish More
 Question:Array Reduction
 */
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i, j, count = 0;
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        boolean b = false;
        for (i = 0; i < n - 1; i++) {
            b = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    b = true;
                }
            }
            if (!b)
                break;
        }

        for (i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.println("Number of non-zero elements" + (n - i - 1));
                count++;
            }
        }
        System.out.println("Number of non-zero elements:0");
        System.out.println("Number of reduction:" + (count + 1));
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
 * SAMPLE 1:
 * Enter no. of elements
 * 5
 * 5 7 3 8 10
 * Number of non-zero elements4
 * Number of non-zero elements3
 * Number of non-zero elements2
 * Number of non-zero elements1
 * Number of non-zero elements:0
 * Number of reduction:5
 * 
 * 
 * Sample 2:
 * Enter no. of elements
 * 6
 * 3 4 5 6 3 5
 * Number of non-zero elements4
 * Number of non-zero elements3
 * Number of non-zero elements1
 * Number of non-zero elements:0
 * Number of reduction:4
 */
