/*Name:Anish More
 Name of the program:Bubble sort
 */

 import java.util.Scanner;
 public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i,j;
        System.out.println("Enter elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean b;
        for(i=0;i<n-1;i++)
        { 
            b=false;
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
                b=true;
                }
            }
            if(!b)
            break;
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
12 8 7 13 1
1  7  8  12  13


2:
Enter no. of elements:5
Enter elements:
2 5 8 10 19
2  5  8  10  19
  */