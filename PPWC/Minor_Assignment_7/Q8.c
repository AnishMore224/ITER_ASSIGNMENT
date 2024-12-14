#include <stdio.h>
int main(){
struct student{
int h;
int w;
int m;
};
struct student s1={20,40,50};
struct student *ptr=&s1;
printf("%d\n",*((int *)ptr+2));
return 0;
}

/*
Output--
50
*/