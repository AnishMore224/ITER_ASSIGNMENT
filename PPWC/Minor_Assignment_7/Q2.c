struct date{
int m,d,y;
};

struct stud{
char name[20];
struct stud *p;
struct date *d;
int (*)fun(int, int);
};

/*
Output--
Q2.c:9:7: error: expected identifier or '(' before ')' token
 int (*)fun(int, int);
*/