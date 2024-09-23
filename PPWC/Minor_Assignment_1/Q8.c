#include <stdio.h>
#include <math.h>

int main(void){
    double v, s, a, t;
    printf("Enter the takeoff speed in km/hr: ");
    scanf("%lf", &v);
    printf("Enter the distance to takeoff in meters: ");
    scanf("%lf", &s);
    v = v * 1000 / 3600;
    a = pow(v, 2) / (2 * s);
    t = v / a;
    printf("The acceleration is %.2lf m/s^2\n", a);
    printf("The time for the fighter to be accelerated to takeoff speed is %.2lf seconds\n", t);
    return 0;
}


/*
Output--
Enter the takeoff speed in km/hr: 278
Enter the distance to takeoff in meters: 94
The acceleration is 31.72 m/s^2
The time for the fighter to be accelerated to takeoff speed is 2.43 seconds
*/