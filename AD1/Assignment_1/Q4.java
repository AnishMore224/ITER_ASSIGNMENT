/*Name:Anish More
 Name of the program:Finding the largest sum contiguous subarray
 */
import java.util.Scanner;

public class Q4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }
    int currmax=arr[0],max=arr[0];
    for(int i=1;i<n;i++)
    {
      if(currmax+arr[i]<arr[i])
      {
        currmax=arr[i];
      }
      else
      currmax+=arr[i];
      max=Math.max(currmax,max);
    }
    System.out.print("Largest sum contiguous subarray: "+max);
  }
}
/*Output 
Enter number of elements: 7 
Enter a number: 2
Enter a number: 6
Enter a number: -1
Enter a number: 8
Enter a number: -10
Enter a number: 30
Enter a number: -30
Largest sum contiguous subarray: 35
 */
