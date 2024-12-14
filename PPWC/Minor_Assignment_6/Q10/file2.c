#include<stdio.h>
#include "file1.c"
int count = 5;
int main(){
write_extern();
write_extern();
printf("%d\n", count);
return(0);
}