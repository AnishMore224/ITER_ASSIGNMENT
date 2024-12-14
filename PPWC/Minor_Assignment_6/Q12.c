#include <stdio.h>
#include <stdlib.h>
int sum(int *arr, int n){
    if(n==0){
        return 0;
    }
    return arr[n-1] + sum(arr, n-1);
}

int main(void){
    int n;
    printf("Enter the number of elements in the array: ");
    scanf("%d", &n);
    int *arr = (int *)malloc(n*sizeof(int));
    printf("Enter the elements of the array: ");
    for(int i=0; i<n; i++){
        scanf("%d", &arr[i]);
    }
    printf("The sum of the elements of the array is: %d\n", sum(arr, n));
    return 0;
}

/*
Output--
Enter the number of elements in the array: 5
Enter the elements of the array: 1 2 3 4 5
The sum of the elements of the array is: 15
*/