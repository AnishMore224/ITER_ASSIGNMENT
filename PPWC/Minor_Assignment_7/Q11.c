#include <stdio.h>
int main(){
struct s1{
char *z;
int i;
struct s1 *p;
};
struct s1 a[]={{"SOA",1,a+1},
{"ITER",2,a+2},
{"CSE",3,a}};
struct s1 *ptr=a;
printf("%s\n", ++(ptr->z));
printf("%s\n", a[(++ptr)->i].z);
printf("%s\n",a[--(ptr->p->i)].z);
printf("%d\n",--a[2].i);
return 0;
}

/*
Output--
OA
CSE
CSE
1
*/