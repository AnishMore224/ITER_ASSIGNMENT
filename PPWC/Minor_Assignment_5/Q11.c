#include<stdio.h>
#include<stdlib.h>

void fun(int **q);
int main(){
    int *p=(int *)malloc(sizeof(int));
    *p=55;
    fun(&p);
    printf("%d %p\n",*p,p);
    return 0;
}
void fun(int **q){
    int r=20;
    **q=r;
    printf("%p\n",*q);
}

/*
Output--
00BC1908
20 00BC1908
*/