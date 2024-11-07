#include <stdio.h>
void sumarr(int a[], int b[], int r[], int size);
int main(void){
    int a[] = {5,-1,7};
    int b[] = {2,4,-2};
    int r[3];
    sumarr(a,b,r,3);
    printf("The sum of the two arrays is: ");
    for(int i=0; i<3; i++){
        printf("%d ",r[i]);
    }
    return 0;
}
void sumarr(int a[], int b[], int r[], int size){
    for(int i=0; i<size; i++){
        r[i] = a[i] + b[i];
    }
}
/*
Output--
The sum of the two arrays is: 7 3 5 
*/