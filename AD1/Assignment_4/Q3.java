
/*Name:Anish More
 Question:check reverse
 */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter elements");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        boolean b = false;
        int beg = -1, end = -1;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1] && beg == -1) {
                beg = i;
            } else if (beg != -1 && arr[i] < arr[i + 1] && end == -1) {
                end = i;
            } else if (arr[i] > arr[i + 1] && beg != -1 && end != -1) {
                b = true;
            }
        }
        if (arr[beg] > arr[end + 1] || arr[end] < arr[beg - 1] || b)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}

/*
 * SAMPLE 1:
Enter no. of elements
6
Enter elements
3 5 8 7 6 12
Yes



* Sample 2:
Enter no. of elements
6
Enter elements
3 5 7 8 6 12
No
 */
