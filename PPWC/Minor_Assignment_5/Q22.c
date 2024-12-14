#include <stdio.h>
#include <stdlib.h>

void fun(){
    int *q=(int *)malloc(sizeof(int));
    *q=20;
}
int main(){
    int *p;
    int *r=NULL;
    fun();
    return 0;
}

/*
Output--
*/