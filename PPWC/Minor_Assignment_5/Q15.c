#include <stdio.h>
#include <stdlib.h>
int main(){
    int *ptr;
    ptr=(int *)calloc(1,sizeof(int));
    *ptr=100;
    printf("%d\n",*ptr);
    ptr=(int *)realloc(ptr,0);
    ptr=NULL;
    printf("%p\n",ptr);
    return 0;
}

/*
Output--
100
00000000
*/