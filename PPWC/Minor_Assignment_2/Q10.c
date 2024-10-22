#include <stdio.h>
int main(void){
    int num;
    printf("Enter the number: ");
    scanf("%d", &num);
    printf("+-----------------------------------------+\n|");
    for (int i = 1; i <= 10; i++){
        printf("%4d", num*i);
    }
    printf(" |\n|");
    for (int i = 1; i <= 10; i++){
        printf("%4d",i);
    }
    printf(" |\n|");
    for (int i = 1; i <= 10; i++){
        printf("%4d", num);
    }
    printf(" |\n");
    printf("+-----------------------------------------+\n");
}

/*
Output:
Enter the number: 8
+-----------------------------------------+
|   8  16  24  32  40  48  56  64  72  80 |
|   1   2   3   4   5   6   7   8   9  10 |
|   8   8   8   8   8   8   8   8   8   8 |
+-----------------------------------------+
*/