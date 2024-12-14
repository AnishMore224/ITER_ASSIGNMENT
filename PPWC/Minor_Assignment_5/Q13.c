#include <stdio.h>
#include <stdlib.h>
int *fun();
int main(void){
    int *ptr=fun();
    printf("%d\n",*ptr);
    return 0;
}
int *fun(){
    int a=10,b=20,*sum;
    sum=(int *)malloc(
    sizeof(int));
    *sum=a+b;
    return sum;
}

/*
Output--
30
*/