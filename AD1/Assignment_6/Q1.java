/* Name: Anish More
  Programn: Finding first repeated elements in an array 
 */
package Assignment_6;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter array elements");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        

        int max=arr[0];
        for (i = 1; i < n; i++) {
            if (arr[i] >max) {
                max=arr[i];
            }
        }
        int count[]=new int[max+1];
        int ele=-1;
        for (i = 0; i < n; i++) {
            count[arr[i]]++;
            if(count[arr[i]]==2){
            ele=arr[i];
            break;
            }
        }
        if(ele==-1)
        System.out.println("No repeated elements");
        else{
            System.out.println("First repeated element is:"+ele);
        }
    }
}


/*
 Output--
Sample 1:
Enter the size of array
7
Enter array elements
5 3 7 3 2 5 1
First repeated element is:3


Sample 2:
Enter the size of array
7
Enter array elements
2 4 6 1 5 7 3
No repeated elements
 */