#include <stdio.h>

int main(){
    int b=65;
    void p=b;
    printf("%d",p);
    return 0;
}

/*
Output--
Q16.c:5:10: error: variable or field 'p' declared void
     void p=b;
*/