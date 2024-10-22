#include <stdio.h>
#include <math.h>

int main(void){
    double x;
    printf("Enter the value of x: ");
    scanf("%lf", &x);
    double result = 0;
    for(int i = 1; i < 10; i++){
        if(i==1){
            result +=(x-1)/x;
            continue;
        }
        result += 0.5 * pow((x-1)/x, i);
    }
    printf("Result: %lf\n", result);
    return 0;
}

/*
Output:
Enter the value of x: 2
Result: 0.749023
*/