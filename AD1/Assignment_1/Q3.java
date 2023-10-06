/*Name:Anish More
 Name of the program:Rotating array by k positions
 */
import java.util.Scanner;

//Method 1
public class Q3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    System.out.print("Enter k: ");
    int k = sc.nextInt();
    k %= n;
    int arr[] = new int[n];
    int rotate[] = new int[n];
    int index = 0, i;
    System.out.print("Enter elements:");
    for (i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (i = k; i < n; i++) {
      rotate[index++] = arr[i];
    }
    for (i = 0; i < k; i++) {
      rotate[index++] = arr[i];
    }

    for (int j = 0; j < n; j++) {
      System.out.print(rotate[j] + "  ");
    }
  }
}




//Method 2
/*
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        System.out.print("Enter k: ");
        int k=sc.nextInt();
        k%=n;
        int arr[]=new int[n];
        int i,temp;
        System.out.print("Enter elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<=k;i++)
        {
            temp=arr[0];
            for(int j=1;j<n;j++)
            {
                arr[j-1]=arr[j];
            }
            arr[n-1]=temp;
        }
        for(int j:arr)
        System.out.print(j+"  ");
    }
 */



/*Output 
Enter number of elements: 5
Enter k: 3
Enter elements:2 3 5 7 8
7  8  2  3  5
 */
