/*Name:Anish More
 Question:Merge two sorted arrays
 */
//Using third array to perform merge operation of two sorted arrays
import java.util.Scanner;

public class Q2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i;
    System.out.println("Enter no. of elements of array 1");
    int n1 = sc.nextInt();
    int arr1[] = new int[n1];

    System.out.println("Enter array 1 elements");
    for (i = 0; i < n1; i++) arr1[i] = sc.nextInt();
    System.out.println("Enter no. of elements of array 2");
    int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    System.out.println("Enter array 2 elements");
    for (i = 0; i < n2; i++) arr2[i] = sc.nextInt();

    int a[] = new int[n1 + n2];
    i = 0;
    int j = 0, k = 0;
    while (i < n1 && j < n2) {
      if (arr1[i] <= arr2[j]) {
        a[k] = arr1[i];
        i++;
      } else {
        a[k] = arr2[j];
        j++;
      }
      k++;
    }
    while (i < n1) {
      a[k] = arr1[i];
      i++;
      k++;
    }
    while (j < n2) {
      a[k] = arr2[j];
      j++;
      k++;
    }
    for (i = 0; i < n1 + n2; i++) {
      System.out.print(a[i] + "  ");
    }
  }
}

/*
Output--
Sample-1:
Enter no. of elements of array 1
5
Enter array 1 elements
1 3 5 6 7
Enter no. of elements of array 2
6
Enter array 2 elements
2 3 4 8 9 10
1  2  3  3  4  5  6  7  8  9  10
 */





//Without using third array to perform merge operation of two sorted arrays
/*
 import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        System.out.println("Enter no. of elements of array 1");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter array 1 elements");
        for (i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter no. of elements of array 2");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter array 2 elements");
        for (i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();
        i = 0;
        int j = 0;
        int temp;
        while (i < n1 && j < n2) {
            j=0;
            if (arr1[i] < arr2[j])
                i++;
            else if (arr1[i] > arr2[j]) {
                temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i++;
            }
            temp = arr2[j];
            while (j < n2 - 1 && arr2[j + 1] < temp) {
                arr2[j] = arr2[j + 1];
                j++;
            }
            arr2[j] = temp;
        }
        System.out.print("Array 1 elements are: ");
        for (i = 0; i < n1; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        System.out.print("Array 2 elements are: ");
        for (i = 0; i < n2; i++) {
            System.out.print(arr2[i] + "  ");
        }
    }
}
 */




/*
Output--
Sample-1:
Enter no. of elements of array 1
5
Enter array 1 elements
1 3 5 6 7
Enter no. of elements of array 2
6
Enter array 2 elements
2 3 4 8 9 10
Array 1 elements are: 1  2  3  3  4  
Array 2 elements are: 5  6  7  8  9  10
 */
