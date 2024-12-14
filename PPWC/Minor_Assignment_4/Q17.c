#include <stdio.h>
#include <ctype.h>

int main(void){
    char argv[4][10] = {"mine","cs","sc","soa"};
    char *ptr;
    for (int i = 0; i < 4; i++){
        ptr = argv[i];
        while (*ptr != '\0'){
            if (islower(*ptr)){
                *ptr = toupper(*ptr);
            }
            ptr++;
        }
    }
    printf("Modified strings:\n");
    for (int i = 0; i < 4; i++){
        printf("%s\n", argv[i]);
    }
    return 0;
}

/*
Output--
Modified strings:
MINE
CS
SC
SOA
*/