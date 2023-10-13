package Assignment_2;
/*Name:Anish More
 Name of the program:Sum of given n numbers(user will input n different numbers)
 */
import java.util.Scanner;

public class Q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n;i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }
    System.out.println("Sum of Elements: " + sum(arr,n-1));
  }

  public static int sum(int arr[],int n)
  {
    if(n==0)
    {
        return arr[0];
    }
    return arr[n]+sum(arr,n-1);
  }
}
/*Output 
Enter number of elements: 5
Enter a number: 2
Enter a number: 4
Enter a number: 1
Enter a number: 3
Enter a number: 7
Sum of Elements: 17
 */
