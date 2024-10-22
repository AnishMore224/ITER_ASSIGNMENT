#include <stdio.h>
int main(void){
    int marks;
    printf("Enter the marks: ");
    scanf("%d", &marks);
    switch(marks){
        case 95 ... 100:
            printf("Grade: O\n");
            break;
        case 81 ... 94:
            printf("Grade: A\n");
            break;
        case 71 ... 80:
            printf("Grade: B\n");
            break;
        case 61 ... 70:
            printf("Grade: C\n");
            break;
        case 51 ... 60:
            printf("Grade: D\n");
            break;
        case 41 ... 50:
            printf("Grade: E\n");
            break;
        case 0 ... 40:
            printf("Grade: F\n");
            break;
        default:
            printf("Invalid marks\n");
            return 1;
    }
    return 0;
}

/*
Output:
Enter the marks: 94
Grade: A
*/