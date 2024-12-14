#include <stdio.h>
int main(void){
    int a = 12, b = 13;
    printf("The address of a is %u\n", &a);
    printf("The address of b is %u\n", &b);
    int c;
    c = a;
    a = b;
    b = c;
    printf("The address of a is %u\n", &a);
    printf("The address of b is %u\n", &b);
    return 0;
}

/*
Output--
The address of a is 6422296
The address of b is 6422292
The address of a is 6422296
The address of b is 6422292
*/