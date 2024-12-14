#include <stdio.h>
int main(void){
    int a[4], b[4], c[4], d[4], sumarray[4];
    int *pa = a, *pb = b, *pc = c, *pd = d, *ps = sumarray;
    printf("Enter values for array a (4 elements):\n");
    for (int i = 0; i < 4; i++){
        printf("a[%d]: ", i);
        scanf("%d", pa + i);
    }

    printf("Enter values for array b (4 elements):\n");
    for (int i = 0; i < 4; i++){
        printf("b[%d]: ", i);
        scanf("%d", pb + i);
    }

    printf("Enter values for array c (4 elements):\n");
    for (int i = 0; i < 4; i++){
        printf("c[%d]: ", i);
        scanf("%d", pc + i);
    }

    printf("Enter values for array d (4 elements):\n");
    for (int i = 0; i < 4; i++){
        printf("d[%d]: ", i);
        scanf("%d", pd + i);
    }

    for (int i = 0; i < 4; i++){
        *(ps + i) = *(pa + i) + *(pb + i) + *(pc + i) + *(pd + i);
    }

    printf("\nElement-wise sum of arrays a, b, c, and d:\n");
    for (int i = 0; i < 4; i++){
        printf("sumarray[%d]: %d\n", i, *(ps + i));
    }
    return 0;
}

/*
Output--
Enter values for array a (4 elements):
a[0]: 1
a[1]: 2
a[2]: 3
a[3]: 4
Enter values for array b (4 elements):
b[0]: 1
b[1]: 2
b[2]: 3
b[3]: 4
Enter values for array c (4 elements):
c[0]: 1
c[1]: 2
c[2]: 3
c[3]: 4
Enter values for array d (4 elements):
d[0]: 1
d[1]: 2
d[2]: 3
d[3]: 4

Element-wise sum of arrays a, b, c, and d:
sumarray[0]: 4
sumarray[1]: 8
sumarray[2]: 12
sumarray[3]: 16
*/