#include<stdio.h>
int fun1(int x,int y){
    return x+y;
}
int fun2(int x,int y){
    return x*y;
}
int main(){
    int x,y;
    int (*fun_ptr[2])(int,int);
    fun_ptr[0]=fun1;
    x=fun_ptr[0](4,5);;
    fun_ptr[1]=fun2;
    y=(*fun_ptr[1])(4,5);
    printf("%d...%d\n",x,y);
    return 0;
}

/*
Output--
9...20
*/