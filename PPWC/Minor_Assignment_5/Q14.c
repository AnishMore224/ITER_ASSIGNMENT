#include <stdio.h>
#include <stdlib.h>
int main(){
    int *ptr;
    ptr=(int *)realloc(NULL,sizeof(int));
    *ptr=100;
    printf("%d\n",*ptr);
    return 0;
}

/*
Output--
100
*/