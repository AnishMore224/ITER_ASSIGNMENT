#include <stdio.h>
int leap(int year);
int main(void){
    int month, day, year;
    int i, day_number = 0;

    printf("Enter the month, day and year: ");
    scanf("%d %d %d", &month, &day, &year);

    switch(month){
        case 1:
            day_number = day;
            break;
        case 2:
            day_number = 31 + day;
            break;
        case 3:
            day_number = 59 + day;
            break;
        case 4:
            day_number = 90 + day;
            break;
        case 5:
            day_number = 120 + day;
            break;
        case 6:
            day_number = 151 + day;
            break;
        case 7:
            day_number = 181 + day;
            break;
        case 8:
            day_number = 212 + day;
            break;
        case 9:
            day_number = 243 + day;
            break;
        case 10:
            day_number = 273 + day;
            break;
        case 11:
            day_number = 304 + day;
            break;
        case 12:
            day_number = 334 + day;
            break;
        default:
            printf("Invalid month\n");
            return 1;
    }
     if(leap(year) && month > 2){
        day_number++;
     }

    printf("Day number: %d\n", day_number);

    return 0;
}

int leap(int year){
    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){        
        return 1;
    }
    return 0;
}

/*
Output:
Enter the month, day and year: 4 22 2024
Day number: 113
*/