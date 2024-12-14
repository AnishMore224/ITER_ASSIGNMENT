#include <stdio.h>

int main(void){
    int la = 345;
    float fb = 4.5;
    char Chvar = 'Z';

    printf("The value of la is %d\n", la);
    printf("The value of fb is %f\n", fb);
    printf("The value of Chvar is %c\n", Chvar);

    printf("The address of la is %u\n", &la);
    printf("The address of fb is %u\n", &fb);
    printf("The address of Chvar is %u\n", &Chvar);
    return 0;
}

/*
Output--
The value of la is 345
The value of fb is 4.500000
The value of Chvar is Z
The address of la is 6422300
The address of fb is 6422296
The address of Chvar is 6422295
*/