/*
You have two independent sorted arrays of size m, and n respectively, where m; n > 0. You are
required to merge the two arrays such that the merged array will be in sorted form and will contain
exactly m+ n number of elements. You are not allowed to use any kind of sorting algorithm. Design
your program to meet the above given requirement.
*/
#include <stdio.h>
void merge(int a[], int b[], int r[], int m, int n);
int main(void){
    int a[] = {1,3,4,7,7,9};
    int b[] = {2,4,6,8,10};
    int r[10];
    merge(a,b,r,5,5);
    printf("The merged array is: ");
    for(int i=0; i<10; i++){
        printf("%d ",r[i]);
    }
    return 0;
}
void merge(int a[], int b[], int r[], int m, int n){
    int i=0, j=0, k=0;
    while(i<m && j<n){
        if(a[i]<b[j]){
            r[k] = a[i];
            i++;
        }
        else{
            r[k] = b[j];
            j++;
        }
        k++;
    }
    while(i<m){
        r[k] = a[i];
        i++;
        k++;
    }
    while(j<n){
        r[k] = b[j];
        j++;
        k++;
    }
}

/*
Output--
The merged array is: 1 2 3 4 4 6 7 7 8 10
*/