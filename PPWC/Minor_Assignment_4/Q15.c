#include <stdio.h>

int main(void){
    int a, b, c, d;
    int *ptr1 = &a, *ptr2 = &b, *ptr3 = &c, *ptr4 = &d;
    *ptr1 = 55;
    *ptr2 = 105;
    *ptr3 = 89;
    *ptr4 = 68;
    int arr[4] = {*ptr1, *ptr2, *ptr3, *ptr4};
    int *arrptr = arr;
    int max = *arrptr;
    for (int i = 0; i < 4; i++){
        if (*(arrptr + i) > max)
            max = *(arrptr + i);
    }
    printf("Max: %d\n", max);
}

/*
Output--
Max: 105
*/