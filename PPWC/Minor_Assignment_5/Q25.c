#include<stdio.h>
int fun(int x,int y){
    int z=x+y+x*y;
    return z;
}
int main(){
    int (*fun_ptr)(int,int);
    fun_ptr=fun;
    int x=fun_ptr(34,56);
    printf("%d\n",x);
    return 0;
}

/*
Output--
1994
*/