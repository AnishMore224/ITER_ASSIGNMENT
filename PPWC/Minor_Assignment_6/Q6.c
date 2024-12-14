#include <stdio.h>
int f(int n){
    static int i = 1 ;
    if (n >=5) return n;
    n = n+1;
    i++;
    return f(n);
}
int main(){
    printf("%d\n", f(1));
    return 0;
}

/*
Output--
5
*/