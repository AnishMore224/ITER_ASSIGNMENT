#include <stdio.h>
int main(){
struct s1{
char *z;
int i;
struct s1 *p;
};
struct s1 a[]={{"SOA",1,a+1},
{"ITER",4,a+2},
{"CSE",5,a}
};
struct s1 *ptr=a;
printf("%s%s%s\n",a[0].z,a[1].z,a[2].z);
printf("%s%s%s",(*ptr).z, ptr->z,a[2].p->z);
return 0;
}

/*
Output--
SOAITERCSE
SOASOASOA'
*/