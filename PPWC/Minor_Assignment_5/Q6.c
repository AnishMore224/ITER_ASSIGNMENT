#include <stdio.h>
int main(){
    int a[][2][4]={5,6,7,8,9,11,12,1};
    printf("%d\n",*(*(*(a+0)+1)+2));
    return 0;
}

/*
Output--
12
*/