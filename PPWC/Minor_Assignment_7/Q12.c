#include <stdio.h>
int main(){
struct test{
int i;
char *c;
};
struct test st[]={5, "Cse-Engg",
4, "computer",
6, "Electrical",
8, "Mechnical",
7, "All-Engg"
};
struct test *p=st;
printf("%s\n", ++(p++ ->c));
printf("%c\n",*p++ ->c);
printf("%d\n",++p->i);
printf("%s\n",p[0].c);
printf("%s\n",p->c);
return 0;}

/*
se-Engg
c
7
Electrical
Electrical
*/