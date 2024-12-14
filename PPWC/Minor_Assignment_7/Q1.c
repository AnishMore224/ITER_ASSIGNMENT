struct oswcourse{
int secid;
float avgm;
char present;
int *marks();
int teacher();
}o1,o2;

/*
Output--
Q1.c:5:6: error: field 'marks' declared as a function
 int *marks();
      ^~~~~
Q1.c:6:5: error: field 'teacher' declared as a function
 int teacher();
     ^~~~~~~
*/