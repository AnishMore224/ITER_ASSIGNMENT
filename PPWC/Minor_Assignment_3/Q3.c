/*
The bubble sort is another technique for sorting an array. A bubble sort compares adjacent array
elements and exchanges their values if they are out of order. In this way, the smaller values ”bubble“
to the top of the array (toward element 0), while the larger values sink to the bottom of the array. After
the first pass of a bubble sort, the last array element is in the correct position; after the second pass
the last two elements are correct, and so on. Thus, after each pass, the unsorted portion of the array
contains one less element. Write and test a function that implements this sorting method.
*/
#include <stdio.h>
void bubble_sort(int a[], int size);
int main(void){
    int a[] = {5,-1,7,2,4,-2};
    bubble_sort(a,6);
    printf("The sorted array is: ");
    for(int i=0; i<6; i++){
        printf("%d ",a[i]);
    }
    return 0;
}
void bubble_sort(int a[], int size){
    int f;
    for(int i=0; i<size; i++){
        f=-1;
        for(int j=0; j<size-1; j++){
            if(a[j]>a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                f=0;
            }
        }
        if(f==-1){
            break;
        }
    }
}

/*
Output--
The sorted array is: -2 -1 2 4 5 7
*/