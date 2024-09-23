// Write a program that predicts the score needed on a final exam to achieve a desired grade in a course.
// The program should interact with the user as follows:
// Enter desired grade> B
// Enter minimum average required> 79.5
// Enter current average in course> 74.6
// Enter how much the final counts
// as a percentage of the course grade> 25
// You need a score of 94.20 on the final to get a B.

#include <stdio.h>
int main(void){
    char grade;
    float min_avg, current_avg, final_weight, final_score;
    printf("Enter desired grade:");
    scanf("%c",&grade);
    printf("Enter minimum average required:");
    scanf("%f",&min_avg);
    printf("Enter current average in course:");
    scanf("%f",&current_avg);
    printf("Enter how much the final counts as a percentage of the course grade:");
    scanf("%f",&final_weight);
    final_score = (min_avg - (current_avg*(1-(final_weight/100))))/(final_weight/100);
    printf("You need a score of %.2f on the final to get a %c.",final_score,grade);
}

/*
Output--
Enter desired grade:B
Enter minimum average required:79.5
Enter current average in course:74.6
Enter how much the final counts as a percentage of the course grade:25
You need a score of 94.20 on the final to get a B.
*/