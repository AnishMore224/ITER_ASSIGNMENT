/*Name:Anish More
 Name of the program:Maximum minimum array (I/p: 1 2 3 4 5, O/p: 5 1 4 2 3) Provided array is sorted
 */
import java.util.Scanner;

public class Q6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    int arr1[]=new int[n];
    for (int i = 0; i < n; i++) {
      System.out.print("Enter a number: ");
      arr[i] = sc.nextInt();
    }
    int i=0,j=n-1;
    for(int index=0;index<n;index++)
    {
      if(index%2==0)
        arr1[index]=arr[j--];
      else
        arr1[index]=arr[i++];
    }
    for(i=0;i<n;i++)
    System.out.print(arr1[i]+" ");
  }
}
/*Output 
Enter number of elements: 6
Enter a number: 2 
Enter a number: 7
Enter a number: 9
Enter a number: 10
Enter a number: 13
Enter a number: 17
17 2 13 7 10 9 
 */
