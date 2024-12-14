#include<stdio.h>

int f(int n){
    while(--n>=0){
    printf("%d ",n-2);}
    return 1;
}
int main(){
    int (*p)(int)=f;
    (*p)(8);
    return 0;
}

/*
Output--
5 4 3 2 1 0 -1 -2
*/