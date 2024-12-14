#include <stdio.h>

int main(void){
    int a = 12, b = 52, c = 8;
    int *ptr1 = &a, *ptr2 = &b, *ptr3 = &c;
    *ptr1 += 10;
    *ptr2 += 10;
    *ptr3 += 10;
    printf("Value of a = %d\n", a);
    printf("Value of b = %d\n", b);
    printf("Value of c = %d\n", c);
    return 0;
}

/*
Output--
Value of a = 22
Value of b = 62
Value of c = 18
*/