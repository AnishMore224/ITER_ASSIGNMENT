#include <stdio.h>
int a, b, c = 0;
void prtFun(void);
int main(){ 
    auto int a = 1; /* Line 1 */
    prtFun( );
    a+=1;
    prtFun( );
    printf("\n %d %d ", a, b);
    return(0);
}
void prtFun(void){ 
    register int a = 2; /* Line 2 */
    int b = 1;
    a += ++b;
    printf(" \n %d %d ", a, b);
}

/*
Output--
 
 4 2  
 4 2
 2 0
*/