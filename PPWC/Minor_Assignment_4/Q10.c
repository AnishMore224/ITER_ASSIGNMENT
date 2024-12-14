#include <stdio.h>

int main(void){
    int arr[] = {120, 502, 118, 188, 106, 447};
    int *ptr1 = &arr[0], *ptr2 = &arr[1], *ptr3 = &arr[2], *ptr4 = &arr[3], *ptr5 = &arr[4], *ptr6 = &arr[5];
    printf("%d %d %d %d %d %d", *ptr1, *ptr2, *ptr3, *ptr4, *ptr5, *ptr6);
}

/*
Output--
120 502 118 188 106 447
*/