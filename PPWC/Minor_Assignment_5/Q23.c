#include <stdio.h>

int main(){
    void *p;
    int *i=20;
    p=&i;
    void *q=p; //line-4
    //line-5
    printf("%d %d %d\n",i,*p,*q);
}

/*
Output--
error: invalid use of void expression
*/