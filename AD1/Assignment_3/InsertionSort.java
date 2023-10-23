/*Name:Anish More
 Name of the program:Insertion sort
 */

 import java.util.Scanner;
 public class InsertionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j,temp;
        System.out.println("Enter elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<n;i++)
        {
            temp=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;  
        }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+"  ");
    }
}

/*
Output--
1-->
Enter no. of elements:5
Enter elements:
2 10 13 5 9
2  5  9  10  13


2-->
Enter no. of elements:5
Enter elements:
10 4 2 11 9
2  4  9  10  11

3-->
Enter no. of elements:5
Enter elements:
2 3 9 10 13
2  3  9  10  13
 */