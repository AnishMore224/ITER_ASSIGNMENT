#include <stdio.h>
int main(void){
    float meters;
    printf("Enter meters:");
    scanf("%f",&meters);
    printf("+---------------+---------------+\n");
    printf("| Unit          | Value\t\t|\n");
    printf("+---------------+---------------+\n");
    printf("| Meters        | %11.2f\t|\n",meters);
    printf("| Kilometers    | %11.2f\t|\n",(meters*0.001));
    printf("| Centimeters   | %11.2f\t|\n",(meters*100));
    printf("| Millimeters   | %11.2f\t|\n",(meters*1000));
    printf("| Feet          | %11.2f\t|\n",(meters*3.28084));
    printf("| Inches        | %11.2f\t|\n",(meters*39.3701));
    printf("+---------------+---------------+");
    printf("\n");
}

/*
Output:
Enter meters:12.5
+---------------+---------------+
| Unit          | Value         |
+---------------+---------------+
| Meters        |       12.50   |
| Kilometers    |        0.01   |
| Centimeters   |     1250.00   |
| Millimeters   |    12500.00   |
| Feet          |       41.01   |
| Inches        |      492.13   |
+---------------+---------------+
*/