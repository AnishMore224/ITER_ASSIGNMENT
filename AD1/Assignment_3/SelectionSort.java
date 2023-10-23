/*Name:Anish More
 Name of the program:Selection sort
 Not stable algorithm
 */

 import java.util.Scanner;
 public class SelectionSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j,min;
        System.out.println("Enter elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        { 
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+"  ");
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
 }

 /*
Output--
1:
Enter no. of elements:5
Enter elements:
2 10 13 1 8
1  2  8  10  13


2:
Enter no. of elements:5
Enter elements:
2 5 8 10 19
2  5  8  10  19
  */