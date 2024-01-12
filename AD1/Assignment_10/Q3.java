/*
 Name:Anish More
 Registraion Number: 2241013365
 Name of program:Heap Sort
 */
package Assignment_10;

import java.util.Scanner;

public class Q3 {

    void maxHeapify(int arr[], int i, int size) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;
        if ((l < size) && (arr[l] > arr[i])) {
            largest = l;
        }
        if ((r < size) && (arr[r] > arr[largest])) {
            largest = r;
        }
        if (largest != i) {
            swap(arr, i, largest);
            maxHeapify(arr, largest,size);
        }
    }

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void BuildMaxHeap(int arr[]) {
        int size = arr.length;
        for (int i = size / 2; i >= 0; i--) {
            maxHeapify(arr, i,size);
        }
    }

    void heapSort(int arr[])
    {
        BuildMaxHeap(arr);
        int size=arr.length;
        swap(arr,0,size-1);
        size--;
        for(int i=size;i>0;i--)
        {
            maxHeapify(arr,0,size);
            swap(arr,0,size-1);
            size--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Heap Size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Q3 obj = new Q3();
        obj.heapSort(arr);
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
 * Output--
Enter Heap Size:6
Enter array elements:5 7 12 8 6 14
Sorted Array:
5 6 7 8 12 14


Enter Heap Size:7
Enter array elements:4 1 3 2 16 9 10
Sorted Array:
1 2 3 4 9 10 16

 */