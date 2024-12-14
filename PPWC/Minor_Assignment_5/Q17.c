#include <stdio.h>
int main(){
    int b=65;
    void *p=&b;
    int *j=(int *)p;
    char *ch=(char *)p;
    printf("%d %c\n",*j,*ch);
    return 0;
}

/*
Output--
65 A
*/