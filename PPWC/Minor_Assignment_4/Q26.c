#include <stdio.h>

void transpose(int *matrix, int *result, int rows, int cols){
    for (int i = 0; i < rows; i++){
        for (int j = 0; j < cols; j++){
            *(result + j * rows + i) = *(matrix + i * cols + j);
        }
    }
}

int main(void){
    int rows = 2, cols = 3;
    int matrix[2][3] = {{1, 2, 3}, {4, 5, 6}};
    int result[3][2];
    transpose(&matrix[0][0], &result[0][0], rows, cols);
    printf("Transposed Matrix:\n");
    for (int i = 0; i < cols; i++){
        for (int j = 0; j < rows; j++){
            printf("%d ", result[i][j]);
        }
        printf("\n");
    }
    return 0;
}

/*
Output--
Transposed Matrix:
1 4 
2 5
3 6
*/