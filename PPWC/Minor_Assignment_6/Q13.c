// Write a program to print “n” Fibonacci numbers using recursion

#include <stdio.h>
#include <stdlib.h>

int print_fibonacci(int n){
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }
    return print_fibonacci(n-1) + print_fibonacci(n-2);
}
int main(){
    int n;
    printf("Enter the number of fibonacci numbers you want to print: ");
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        printf("%d ", print_fibonacci(i));
    }
    return 0;
}

/*
Output--
Enter the number of fibonacci numbers you want to print: 5
0 1 1 2 3 
*/