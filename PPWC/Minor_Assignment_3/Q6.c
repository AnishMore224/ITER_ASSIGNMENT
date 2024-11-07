/*
Design a program to find the difference between two sets or arrays. The difference between two sets
or arrays: All the elements of the first array that don’t appear in the second array. If array p has
the elements f 1, 2, 3, 4g and array q has the elements f2, 4, 5, 6 g, then the difference between the
two arrays, p-q will be f1, 3 g.
*/
#include <stdio.h>
int diff(int a[], int b[], int r[], int m, int n);
int main(void){
    int a[] = {1,2,3,4};
    int b[] = {2,4,5,6};
    int r[10];
    int len=diff(a,b,r,4,4);
    printf("The difference between the two arrays is: ");
    for(int i=0; i<len; i++){
       printf("%d ",r[i]);
    }
    return 0;
}

int diff(int a[], int b[], int r[], int m, int n){
    int k=0;
    for(int i=0; i<m; i++){
        int flag = 0;
        for(int j=0; j<n; j++){
            if(a[i]==b[j]){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            r[k] = a[i];
            k++;
        }
    }
    return k;
}

/*
Output--
The difference between the two arrays is: 1 3 
*/