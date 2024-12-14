#include <stdio.h>
int funcp(){
    static int x = 1;
    x++;
    return x;
}
int main(){
    int x,y;
    x = funcp();
    y = funcp()+x;
    printf("%d\n", (x+y));
    return 0;
}

/*
Output--
7
*/