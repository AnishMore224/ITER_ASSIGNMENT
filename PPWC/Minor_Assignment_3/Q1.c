#include <stdio.h>
int main(void){
    int prime_lt_100[] = {2, 3, 5, 7, 11, 13, 17,19, 23, 29, 31, 37,41, 43, 47, 53, 59,61, 67, 71, 73, 79, 83, 89, 97};
    printf("%d\n",prime_lt_100[24]);
    int i=10;
    printf("%d\n",prime_lt_100[i+4]);
    printf("%d\n",prime_lt_100[prime_lt_100[2] + prime_lt_100[0]]);
    printf("%d\n",prime_lt_100[6]=prime_lt_100[6] + prime_lt_100[16]);
    return 0;
}

/*
Output--
97
47
19
76
*/
