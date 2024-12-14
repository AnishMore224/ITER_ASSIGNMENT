#include <stdio.h>
int main(){
    int a[][3]={4,5,6,7,8,9,1,2,3};
    printf("%d,", *a[2]);
    printf("%d,", a[2][0]);
    printf("%d ", **(a+1+('b'-'a')));
    return 0;
}
/*
Output--
1,1,1
*/
