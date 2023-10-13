package Assignment_2;

/*Name:Anish More
 Name of the program:Finding maximum and minimum
 */
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextInt();
        }

        int a[] = {arr[0],arr[0]};
        largeSmall(arr, n-1, a);
        System.out.println("Smallest of the Elements:" + a[0]);
        System.out.println("Largest of the Elements:" + a[1]);

    }

    public static void largeSmall(int arr[], int n,int a[]) {
        if (n == 0)
            return ;
        largeSmall(arr, n - 1,a);
        if (arr[n] < a[0]) {
            a[0] = arr[n];
        }
        if (arr[n] > a[1]) {
            a[1] = arr[n];
        }
    }
}
/*
 * Output
 * Enter number of elements: 5
 * Enter a number: 3
 * Enter a number: 8
 * Enter a number: 0
 * Enter a number: 2
 * Enter a number: 10
 * Smallest of the Elements:0
 * Largest of the Elements:10
 */
